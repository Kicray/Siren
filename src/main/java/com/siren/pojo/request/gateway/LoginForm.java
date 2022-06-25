package com.siren.pojo.request.gateway;

import com.siren.pojo.request.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginForm extends BaseRequest {

    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
