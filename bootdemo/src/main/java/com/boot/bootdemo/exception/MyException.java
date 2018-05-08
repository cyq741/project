package com.boot.bootdemo.exception;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class MyException {

    public static final String ERROR_VIEW = "erro";

    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
        System.out.println("异常捕获。。。。。");
        e.printStackTrace();

        ModelAndView m = new ModelAndView();
        m.addObject("exception", e);
        m.addObject("url", request.getRequestURI());
        m.setViewName(ERROR_VIEW);

        return m;
    }

    /**
     * 判断是否是ajax请求
     *
     * @param request
     * @return
     */
    public static boolean isAjax(HttpServletRequest request) {

        return (request.getHeader("X-Requested-With") != null) && "X-Requested-With".equals(request.getHeader("X-Requested-With").toString());
    }

}
