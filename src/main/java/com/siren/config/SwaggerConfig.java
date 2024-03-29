package com.siren.config;

import com.siren.properties.swagger.SwaggerProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/25
 */
@Configuration("sirenSwaggerConfig")
@EnableSwagger2
public class SwaggerConfig implements Serializable {
    private static final long serialVersionUID = -4308082312511684602L;
    @Resource(name = "sirenSwaggerProperty")
    private SwaggerProperty swaggerProperty;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(securitySchemes());
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title(swaggerProperty.getTitle())
                //版本号
                .version(swaggerProperty.getVersion())
                //描述
                .description(swaggerProperty.getDescription())
                .termsOfServiceUrl(swaggerProperty.getTermsOfServiceUrl())
                .build();
    }

    /**
     * 设置全局认证的
     * @return
     */
    private List<ApiKey> securitySchemes() {
        List<ApiKey> apiKeyList= new ArrayList();
        apiKeyList.add(new ApiKey("x-auth-token", "x-auth-token", "header"));
        return apiKeyList;
    }
}
