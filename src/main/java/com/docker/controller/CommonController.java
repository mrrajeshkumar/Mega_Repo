package com.docker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class CommonController {


    @GetMapping("/")
    public String getValue() {
        System.out.println(" getValue method called..........l-CommonController.........sout");
        log.info("getValue method called....... l-CommonController...........logging");
        return "This is a string value!";
    }
}
