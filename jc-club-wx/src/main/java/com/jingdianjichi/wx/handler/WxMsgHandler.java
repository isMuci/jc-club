package com.jingdianjichi.wx.handler;

import com.jingdianjichi.wx.enums.WxMsgTypeEnum;

import java.util.Map;

public interface WxMsgHandler {
    WxMsgTypeEnum getMsgType();

    String dealMsg(Map<String,String> msgMap);
}
