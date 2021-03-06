package com.demo.springglobalexceptionhandler.exception;

import com.demo.springglobalexceptionhandler.consts.ApiStatus;

import javax.validation.ConstraintViolationException;

public class UserNotFoundException extends IGlobalException {
    private static final long serialVersionUID = -2049125462837889623L;

    @Override
    public ApiStatus getApiStatus() {
        return ApiStatus.UserNotFoundException;
    }

    public UserNotFoundException() {
        super(ApiStatus.UserNotFoundException);
    }
}
