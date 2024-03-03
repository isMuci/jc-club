package com.jingdianjichi.wx.controller;

import com.jingdianjichi.wx.handler.WxMsgFactory;
import com.jingdianjichi.wx.handler.WxMsgHandler;
import com.jingdianjichi.wx.utils.MessageUtil;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import com.jingdianjichi.wx.utils.SHA1;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Objects;

@RestController
@Slf4j
public class CallbackController {

    private static final String token = "0e392fa97564734d";

    @Resource
    private WxMsgFactory wxMsgFactory;

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }

    @GetMapping("/callback")
    public String callback(@RequestParam("signature") String signature, @RequestParam("timestamp") String timestamp,
        @RequestParam("nonce") String nonce, @RequestParam("echostr") String echostr) {
        log.info("get验签请求参数：signature:{}, timestamp:{}, nonce:{}, echostr:{}", signature, timestamp, nonce, echostr);
        String shaStr = SHA1.getSHA1(token, timestamp, nonce, "");
        if (signature.equals(shaStr)) {
            return echostr;
        }
        return "unknown";
    }

    @PostMapping(value = "/callback", produces = "application/xml;charset=UTF-8")
    public String callback(@RequestBody String requestBody, @RequestParam("signature") String signature,
        @RequestParam("timestamp") String timestamp, @RequestParam("nonce") String nonce,
        @RequestParam(value = "msg_signature",required = false) String msgSignature) {
        log.info("接收到微信的请求：requestBody:{} signature:{}, timestamp:{}, nonce:{}, msg_signature:{}",requestBody, signature, timestamp, nonce, msgSignature);
        Map<String,String>msgMap= MessageUtil.parseXml(requestBody);
        String msgType=msgMap.get("MsgType");
        String event=msgMap.get("Event")==null?"":msgMap.get("Event");
        log.info("msgType:{}, event:{}",msgType,event);
        String msgTypeKey=msgType;
        if (!StringUtils.isEmpty(event))
            msgTypeKey+="."+event;
        WxMsgHandler wxMsgHandler = wxMsgFactory.getHandlerByMsgType(msgTypeKey);
        if (Objects.isNull(wxMsgHandler))return "unknown";
        String replyContent=wxMsgHandler.dealMsg(msgMap);
        log.info("replyContent:{}",replyContent);
        return replyContent;
    }
}
