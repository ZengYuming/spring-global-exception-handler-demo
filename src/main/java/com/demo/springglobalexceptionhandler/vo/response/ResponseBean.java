package com.demo.springglobalexceptionhandler.vo.response;

/**
 * Created by TonyZeng on 2017/2/6.
 */
public class ResponseBean<T extends Object> {
    public ResponseBean() {
    }

    /**
     * 0:成功
     *
     * @see ResponseCodeType
     */
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

    public static ResponseBean createSuccess() {
        ResponseBean rs = new ResponseBean();
        rs.setCode(ResponseCodeType.SUCCESS.getCode());
        rs.setMsg(ResponseCodeType.SUCCESS.getDesc());
        rs.data = null;
        return rs;
    }

    public static <T> ResponseBean<T> createSuccess(T data) {
        ResponseBean rs = new ResponseBean();
        if (data == null) {
            rs.setCode(ResponseCodeType.SUCCESS.getCode());
            rs.setMsg("暂无数据");
        } else {
            rs.setCode(ResponseCodeType.SUCCESS.getCode());
            rs.setMsg("success");
            rs.setData(data);
        }
        return rs;
    }


    public static <T> ResponseBean<T> createError() {
        ResponseBean rs = new ResponseBean();
        rs.setCode(ResponseCodeType.ERROR.getCode());
        rs.setMsg(ResponseCodeType.ERROR.getDesc());
        rs.data = null;
        return rs;
    }

    public static <T> ResponseBean<T> createError(String msg) {
        ResponseBean rs = new ResponseBean();
        rs.setCode(ResponseCodeType.ERROR.getCode());
        rs.setMsg(msg);
        rs.data = null;
        return rs;
    }


    public enum ResponseCodeType {
        FAILED(-1, "FAILED"),
        SUCCESS(0, "SUCCESS"),
        ERROR(1, "ERROR"),
        NEED_LOGIN(10, "NEED_LOGIN"),
        ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

        private final int code;
        private final String desc;

        ResponseCodeType(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
}
