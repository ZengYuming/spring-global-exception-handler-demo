package com.demo.springglobalexceptionhandler.handler;

/**
 * 统一异常处理
 * Created by 曾芋茗 on 2/27/2018.
 */

import com.demo.springglobalexceptionhandler.exception.IGlobalException;
import com.demo.springglobalexceptionhandler.exception.UserNotFoundException;
import com.demo.springglobalexceptionhandler.vo.response.ResponseBean;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * todo:此handler只能捕捉Controller范围的异常，Controller return之后的事情，它捕捉不到。
 * todo:需要另外解决，比如return 里面的对象没有实现Serializable接口，虽然捕捉到了，但是不知道为什么还是返回了没有包装的响应对象。
 */
@ControllerAdvice
public class ExceptionHandler {
    /**
     * 全局参数验证
     *
     * @param e
     * @return
     */
    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value = BindException.class)
    public ResponseBean handle(BindException e) {
        return ResponseBean.toResponseEntity(e.getFieldError().getDefaultMessage());
    }

    /**
     * 全局异常统一处理
     *
     * @param e
     * @return
     */
    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public ResponseBean handle(Exception e) {
        return ResponseBean.toResponseEntity(e.getMessage());
    }

    /**
     * 全局参数验证
     *
     * @param e
     * @return
     */
    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value = IGlobalException.class)
    public ResponseBean handle(IGlobalException e) {
        return ResponseBean.toResponseEntity(e.getApiStatus());
    }
}
