package com.rjkf.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "自定义消息")
public class UserCustomException extends RuntimeException {

    public UserCustomException(){}

    public UserCustomException(String message){
        super(message);
    }
}
