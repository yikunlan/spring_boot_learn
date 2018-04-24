package com.example.hyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplatesController {
    @RequestMapping("/input")
    public String input(){
        return "/input";
    }
}
