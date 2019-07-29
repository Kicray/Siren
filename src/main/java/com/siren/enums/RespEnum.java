package com.siren.enums;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/29
 */
public enum RespEnum {
    /************系统级错误**************/
    SYS_ERROR_REQ(0, "请求异常"),
    SYS_ERROR_TOKEN(1, "请登录");
    /************系统级错误**************/

    private int code;
    private String message;

    RespEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
