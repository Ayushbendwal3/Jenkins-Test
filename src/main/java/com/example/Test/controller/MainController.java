package com.example.Test.controller;

import com.example.Test.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final MainService mainService;

    MainController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/")
    public String getData(){
        return mainService.getDataFromService();
    }
}
