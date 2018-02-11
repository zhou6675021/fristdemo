package com.commons;

import com.menus.CodeEnum;
import lombok.Data;

@Data
public class BaseException extends RuntimeException {
    private CodeEnum codeEnum;

    public BaseException(CodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.codeEnum = codeEnum;
    }
}
