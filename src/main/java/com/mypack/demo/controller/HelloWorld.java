/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sureshghale
 */
@Controller
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello(){
        return "hello java security";
    }
    
}
