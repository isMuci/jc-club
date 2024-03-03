package com.jingdianjichi.wx.handler;

import com.jingdianjichi.wx.enums.WxMsgTypeEnum;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class WxMsgFactory implements InitializingBean {
    @Resource
    private List<WxMsgHandler> wxMsgHandlerList;

    private Map<WxMsgTypeEnum,WxMsgHandler>handlerMap=new HashMap<>();

    public WxMsgHandler getHandlerByMsgType(String msgType){
        WxMsgTypeEnum wxMsgTypeEnum=WxMsgTypeEnum.getByMsgType(msgType);
        return handlerMap.get(wxMsgTypeEnum);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        for (WxMsgHandler wxMsgHandler : wxMsgHandlerList) {
            handlerMap.put(wxMsgHandler.getMsgType(), wxMsgHandler);
        }
    }
}
