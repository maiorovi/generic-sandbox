package org.kiev.sqlquerybuilder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class IndexController {

    @GetMapping(path = "/")
    public String getData(@RequestParam Map<String,String> allRequestParams) {
            allRequestParams.forEach((key, value) -> System.out.println(key + " : " + value));

            return "hello world";
    }
}
