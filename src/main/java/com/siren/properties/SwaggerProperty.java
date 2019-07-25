package com.siren.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/25
 */
@Data
@Component("sirenSwaggerProperty")
@ConfigurationProperties(prefix = "siren.swagger")
public class SwaggerProperty implements Serializable {
    private static final long serialVersionUID = -4399145808030285378L;
    private String title;
    private String version;
    private String description;
    private String termsOfServiceUrl;
}
