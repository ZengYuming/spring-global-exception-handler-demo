package com.demo.springglobalexceptionhandler.vo.response;

import com.demo.springglobalexceptionhandler.consts.ApiStatus;

/**
 * Created by TonyZeng on 2017/2/6.
 */
public class ResponseBean<T extends Object> {
    public ResponseBean() {
    }

    private Integer code;
    /**
     * null:成功
     */
    private String msg;
    /**
     * data
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResponseBean<T> toResponseEntity(String msg) {
        ResponseBean rs = new ResponseBean();
        rs.setCode(-1);
        rs.setMsg(msg);
        rs.data = null;
        return rs;
    }

    public static <T> ResponseBean<T> toResponseEntity(ApiStatus apiStatus) {
        ResponseBean rs = new ResponseBean();
        rs.setCode(apiStatus.value());
        rs.setMsg(apiStatus.message());
        rs.data = null;
        return rs;
    }
}
