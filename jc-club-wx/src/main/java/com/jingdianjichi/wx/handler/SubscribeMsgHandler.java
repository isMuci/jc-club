package com.jingdianjichi.wx.handler;

import com.jingdianjichi.wx.enums.WxMsgTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class SubscribeMsgHandler implements WxMsgHandler {
    @Override
    public WxMsgTypeEnum getMsgType() {
        return WxMsgTypeEnum.SUBSCRIBE;
    }

    @Override
    public String dealMsg(Map<String, String> msgMap) {
        log.info("触发用户关注事件");
        String toUserName = msgMap.get("ToUserName");
        String fromUserName = msgMap.get("FromUserName");
        String subscribeContent = "你好,这里是棘刺克拉博";
        String replyContent = "<xml>\n" + "  <ToUserName><![CDATA[" + fromUserName + "]]></ToUserName>\n"
            + "  <FromUserName><![CDATA[" + toUserName + "]]></FromUserName>\n"
            + "  <CreateTime>12345678</CreateTime>\n" + "  <MsgType><![CDATA[text]]></MsgType>\n"
            + "  <Content><![CDATA[" + subscribeContent + "]]></Content>\n" + "</xml>";
        return replyContent;
    }
}
