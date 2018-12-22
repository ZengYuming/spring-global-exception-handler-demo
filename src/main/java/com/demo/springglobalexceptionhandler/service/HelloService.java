package com.demo.springglobalexceptionhandler.service;

import com.demo.springglobalexceptionhandler.vo.response.hello.HelloRes;
import org.springframework.http.ResponseEntity;

public interface HelloService {
    ResponseEntity<HelloRes> getHello(int exceptionType);
}
