package com.smartparkinglot.backendservice.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class WrongCredentialsException extends RuntimeException{

    public WrongCredentialsException(String message) {
        super(message);
    }
}
