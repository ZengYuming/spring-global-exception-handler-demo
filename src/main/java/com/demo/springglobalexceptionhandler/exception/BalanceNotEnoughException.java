package com.demo.springglobalexceptionhandler.exception;

import com.demo.springglobalexceptionhandler.consts.ApiStatus;

public class BalanceNotEnoughException extends IGlobalException {
    private static final long serialVersionUID = -2049125462837889623L;

    @Override
    public ApiStatus getApiStatus() {
        return ApiStatus.BalanceNotEnoughException;
    }

    public BalanceNotEnoughException() {
        super(ApiStatus.BalanceNotEnoughException);
    }
}
