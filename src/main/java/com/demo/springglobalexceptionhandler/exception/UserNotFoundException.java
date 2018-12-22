package com.demo.springglobalexceptionhandler.exception;

import javax.validation.ConstraintViolationException;

public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -2049125462837889623L;

    public UserNotFoundException() {
        super("用户ID不存在！");
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(ConstraintViolationException ex) {
        super("用户ID不存在！", ex);
    }
}
