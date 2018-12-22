package com.demo.springglobalexceptionhandler.controller;

import com.demo.springglobalexceptionhandler.service.HelloService;
import com.demo.springglobalexceptionhandler.vo.response.hello.HelloRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(path = "/{exceptionType}")
    public ResponseEntity<HelloRes> getHello(@PathVariable("exceptionType") int exceptionType) {
        return helloService.getHello(exceptionType);
    }
}
