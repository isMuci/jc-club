package com.jingdianjichi.wx.enums;

public enum WxMsgTypeEnum {
    SUBSCRIBE("event.subscribe","用户关注事件"),
    TEXT_MSG("text","接收用户文本消息");
    private String msgType;
    private String desc;

    WxMsgTypeEnum(String msgType,String desc){
        this.msgType=msgType;
        this.desc=desc;
    }

    public static WxMsgTypeEnum getByMsgType(String msgType){
        for (WxMsgTypeEnum wxMsgTypeEnum:WxMsgTypeEnum.values()){
            if (wxMsgTypeEnum.msgType.equals(msgType)){
                return wxMsgTypeEnum;
            }
        }
        return null;
    }
}
