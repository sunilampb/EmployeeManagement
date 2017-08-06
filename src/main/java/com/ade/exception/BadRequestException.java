package com.ade.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends  RuntimeException {

    public BadRequestException(String msg){
        super(msg);
    }
}
