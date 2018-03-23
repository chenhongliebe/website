package com.frico.website.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;

/**
 * Created by IntelliJ IDEA
 * User: Administrator
 * Date: 2018/3/20
 * Time: 15:20
 * Java gives me life and I have to work hard.
 */
public
class MyInterceptor implements HandlerInterceptor{

    public static final
    Logger log = LoggerFactory.getLogger("MyInterceptor");

    @Override
    public
    boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getRequestURI();
        log.info(path);
        System.out.println(path);
        InetAddress i =null;
        return true;
    }

    @Override
    public
    void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public
    void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
