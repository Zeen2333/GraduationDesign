package com.zeen.graduationdesign.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ErrorEnum {
    ;

    private final int code;
    private final String errMsg;

    public int getCode() {
        return code;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
