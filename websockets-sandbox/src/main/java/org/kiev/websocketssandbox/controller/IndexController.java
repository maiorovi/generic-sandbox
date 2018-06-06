package org.kiev.websocketssandbox.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class IndexController {

    @Value("${welcome.message:test}")
    private String message;


    @GetMapping(value = "/")
    public String index(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }


    @GetMapping(value = "/other")
    public String other(Map<String, Object> model) {
        model.put("message", this.message);
        return "other";
    }



}
