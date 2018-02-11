package com.model;

import com.menus.CodeEnum;
import lombok.Data;

/**
 * @author hbwxz
 * @param <T>
 */
@Data
public class Response<T> {
    private  String  code;
    private  String  message;
    private   T    data;
    public Response(CodeEnum code,T data){
        this.code  = code.getCode();
        this.message = code.getMessage();
        this.data = data;
    }
    @Override
    public String toString(){
        return "Response{"+
                "code='" + code + '\''+
                ", message'=" + message +'\''+
                ", data=" + data.toString() +
                '}';
    }
}
