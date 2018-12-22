package com.demo.springglobalexceptionhandler.service.impl;

import com.demo.springglobalexceptionhandler.exception.UserNotFoundException;
import com.demo.springglobalexceptionhandler.service.HelloService;
import com.demo.springglobalexceptionhandler.vo.response.hello.HelloRes;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public ResponseEntity<HelloRes> getHello(int exceptionType) {
        if(exceptionType==0){
            throw new UserNotFoundException();
        }else if(exceptionType==1){
            throw  new NullPointerException();
        }else if(exceptionType==2){
            throw new OutOfMemoryError();
        }
        return null;
    }
}
