package com.jingdianjichi.wx.handler;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jingdianjichi.wx.enums.WxMsgTypeEnum;
import com.jingdianjichi.wx.redis.RedisUtil;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ReceiveTextMsgHandler implements WxMsgHandler{

    private static final String KEY_WORD="验证码";

    private static final String LOGIN_PREFIX="loginCode";

    @Resource
    private RedisUtil redisUtil;

    @Override
    public WxMsgTypeEnum getMsgType() {
        return WxMsgTypeEnum.TEXT_MSG;
    }

    @Override
    public String dealMsg(Map<String,String> msgMap) {
        log.info("接收用户文本消息");
        String content=msgMap.get("Content");
        if(!KEY_WORD.equals(content)){
            return "";
        }
        String toUserName=msgMap.get("ToUserName");
        String fromUserName=msgMap.get("FromUserName");
        String num = String.valueOf(new Random().nextInt(1000));
        String numKey = redisUtil.buildKey(LOGIN_PREFIX,num);
        redisUtil.setNx(numKey,fromUserName,5L, TimeUnit.MINUTES);
        String numContent="验证码为："+num+"\n5分钟内有效";
        String replyContent="<xml>\n" +
                "  <ToUserName><![CDATA["+fromUserName+"]]></ToUserName>\n" +
                "  <FromUserName><![CDATA["+toUserName+"]]></FromUserName>\n" +
                "  <CreateTime>12345678</CreateTime>\n" +
                "  <MsgType><![CDATA[text]]></MsgType>\n" +
                "  <Content><![CDATA["+numContent+"]]></Content>\n" +
                "</xml>";
        return replyContent;
    }
}
