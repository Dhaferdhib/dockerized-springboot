package com.example.dockerspringbootmysql.interceptors;

import com.example.dockerspringbootmysql.exceptions.InvalidPathException;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ControllerInterceptor implements HandlerInterceptor {

    Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception arg3)
            throws Exception {
        log.info("Request Completed!");
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView model)
            throws Exception {
        log.info("Method executed");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
//        log.info("servlet Path :" + request.getServletPath());
//        log.info("context Path :" + request.getContextPath());
        if( !checkPathValidity(request.getServletPath())){
            throw new InvalidPathException();
        }
        return true;
    }

    boolean checkPathValidity(String path){
        if (path.contains("all")){
            //valid path
            return true;
        }else{
            //invalid path
            return false;
        }
    }

}
