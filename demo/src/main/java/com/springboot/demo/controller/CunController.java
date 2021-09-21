package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by Raymon
 * @version: v1.0
 * @description:
 * @date:2021/9/20
 **/
@RestController
public class CunController {
    public  int i=0;

    @GetMapping("/add")
    public int countadd() throws InterruptedException {
        Thread.sleep(10);
        i=i+1;
        return i;
    }
    @GetMapping("re")
    public int chongzhi(){
        i=0;
        return i;
    }
}
