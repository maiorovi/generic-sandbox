package org.kiev.jmssandbox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(path = "/hello-world")
    public String hellorequest() {
        return "hello from spring boot!";
    }
}
