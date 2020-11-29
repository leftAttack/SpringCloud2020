package com.atguigu.springcloude.controller;


import com.atguigu.springcloude.service.IMessageProvider;
import com.atguigu.springcloude.service.impl.IMessageProviderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author Yue_
 * @create 2020-11-29-15:54
 */
@RestController
public class StreamController {

    @Resource
    private IMessageProviderImpl messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }



}
