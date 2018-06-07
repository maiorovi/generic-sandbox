package org.kiev.jmssandbox.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.annotation.JmsListeners;
import org.springframework.stereotype.Component;

@Component
public class MyJmsConsumer {

    @JmsListener(destination = "test.foo")
    public void recieveMessage(final String jsonMessage) throws InterruptedException {
        System.out.println(jsonMessage);
//        Thread.sleep(3000);
    }
}
