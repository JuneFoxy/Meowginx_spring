package com.meowginx.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index_Controller {

    @RequestMapping("/")
    public String index_process() {
        return "index_process";
    }
}
