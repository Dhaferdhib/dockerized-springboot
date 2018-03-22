package com.example.dockerspringbootmysql.controller;

import com.example.dockerspringbootmysql.exceptions.InvalidPathException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandlerController {

//    @Override
    @ExceptionHandler(InvalidPathException.class)
    @ResponseBody
    public String handleInvalidPathException(){
        return "it is me dhafer ... check path";
    }

}
