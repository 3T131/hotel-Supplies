package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Passenger")
public class Passenger {
    @RequestMapping("/tolist.do")
    public String list(){
        return "passenger/list";
    }

}
