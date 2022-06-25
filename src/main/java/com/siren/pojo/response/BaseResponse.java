package com.siren.pojo.response;

import lombok.Data;
import org.aspectj.apache.bcel.classfile.Code;

import java.io.Serializable;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/29
 */
@Data
public abstract class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 7461566145155226665L;

    private int code;
    private String message;
    private T data;

    public BaseResponse(T data){
        this(200,"",data);
    }

    public BaseResponse(int code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResponse() {
    }
}
