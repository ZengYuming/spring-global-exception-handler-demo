package com.demo.springglobalexceptionhandler.vo.response.hello;

import java.io.Serializable;

public class HelloRes implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
