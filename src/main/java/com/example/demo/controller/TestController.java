package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xxx
 *
 * @author 王冲
 * @date 2021-10-19 16:27
 */
@RestController
public class TestController {

    @GetMapping
    public String say(){
        return "hello";
    }
}
