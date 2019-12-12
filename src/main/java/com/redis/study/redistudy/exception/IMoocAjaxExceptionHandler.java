package com.redis.study.redistudy.exception;

import com.redis.study.redistudy.pojo.IMoocJSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class IMoocAjaxExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public IMoocJSONResult defaultErrorHandler(HttpServletRequest req,
                                               Exception e) throws Exception {

        e.printStackTrace();
        return IMoocJSONResult.errorException(e.getMessage());
    }
}
