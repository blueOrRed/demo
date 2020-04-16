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

    @GetMapping("localPrint")
    public void localPrint(){
        System.out.println("====我是一个无情的打印机器======");
    }


    @GetMapping("login")
    public String login(String username,String password){
        //先判断大的
        if((username ==null || "".equals(username.trim())) && (password==null || "".equals(password.trim()))){
            return "用户名和密码不得为空!";
        }

        if(username ==null || "".equals(username)){
            return "用户名不能为空!";
    }
        if(password==null || "".equals(password)){
        return "密码不能为空!";
    }
        if(username.equals("zyHelloWorld") && password.equals("zyaile00")){
            return "登录成功!";
        }
        return "登录失败！请重新输入用户名或密码!!";
    }
}
