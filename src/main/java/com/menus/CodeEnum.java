package com.menus;

import lombok.Getter;

/**
 * @author hbwxz
 */
@Getter
public enum  CodeEnum {
    SUCCESS("0","处理成功"),
    FALSE("1","处理失败"),
    NO_LOGIN("2","未登录");
    private String    code;
    private String   message;
    CodeEnum(String code,String message){
        this.code = code;
        this.message = message;
    }

}
