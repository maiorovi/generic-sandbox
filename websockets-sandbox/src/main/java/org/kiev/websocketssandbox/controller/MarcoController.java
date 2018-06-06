package org.kiev.websocketssandbox.controller;

import org.kiev.websocketssandbox.domain.Shout;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MarcoController {

    @MessageMapping("/marco")
    @SendTo(value = "/topic/marco")
    public Shout handleShout(Shout incoming) {
        System.out.println(incoming.getMessage());

        return incoming;
    }
}
