package com.offcn.consumer;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

//消息消费者

@Component
public class ReciveMsg {

    //指定要监听的队列名称
    @JmsListener(destination = "queue-offcn")
    public void reciveMsg(String msg){
        System.out.println("收到消息："+msg);
    }

    @JmsListener(destination = "queue-map")
    public void reciveMap(Map map){
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> o : entrySet) {
            System.out.println(o.getKey()+"  "+o.getValue());
        }
    }
}
