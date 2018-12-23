package com.demo.springglobalexceptionhandler.exception;

import com.demo.springglobalexceptionhandler.consts.ApiStatus;

public abstract class IGlobalException extends RuntimeException {
    ApiStatus apiStatus;

    public ApiStatus getApiStatus() {
        return ApiStatus.Failed;
    }

    public IGlobalException() {
        super(ApiStatus.Failed.message());
    }

    public IGlobalException(ApiStatus apiStatus) {
        super(apiStatus.message());
        this.apiStatus = apiStatus;
    }
}
