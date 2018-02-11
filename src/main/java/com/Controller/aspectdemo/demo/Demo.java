package com.Controller.aspectdemo.demo;

import com.menus.CodeEnum;
import com.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * @author hbwxz
 */
@RestController
@RequestMapping(value ="/1")
public class Demo {
    @RequestMapping("/2")
    public Response list(HttpServletRequest request){
           request.getHeader("user_Id");
       return new Response(CodeEnum.SUCCESS,null);

    }
}
