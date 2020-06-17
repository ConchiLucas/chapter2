package com.example.demo.controller;

import com.example.demo.service.GameOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private GameOnlineService gameOnlineService;

    @RequestMapping("index")
    public String execute(){

        return "success";
    }

    @RequestMapping("gameOnline")
    public String gameOnline(){
        gameOnlineService.gameOnline();
        return "success";
    }

}
