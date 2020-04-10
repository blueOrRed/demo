package com.zy.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("git")
public class GitController {


    @GetMapping("print")
    public String print(){
        return "clone pull fetch push --->Git!";
    }
}
