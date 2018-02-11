package com.aop;

import com.commons.BaseException;
import com.menus.CodeEnum;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;


import javax.servlet.http.HttpServletRequest;

/**
 * @author hbwxz
 */

@Component
@Aspect
public class Aspectdemo {
    //监控controllerdem
    @Before("execution(* com.Controller.aspectdemo.demo.*.*(..)) && args(..,request)")
    public  void  userTimeLog(HttpServletRequest request) throws Throwable{
        String  userId = request.getHeader("user_id");
        //userId不存在时，就返回异常
        if ( null == userId) {
            throw new BaseException(CodeEnum.NO_LOGIN);
        }
    }


}
