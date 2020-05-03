package com.fwtai.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-03 2:10
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController{

    @DeleteMapping
    public String delete(){
        return "Delete";
    }

    @GetMapping
    public String findById(){
        return "Get";
    }

    @PutMapping
    public String update(){
        return "Put";
    }

    @PostMapping
    public String add(){
        return "Post";
    }
}