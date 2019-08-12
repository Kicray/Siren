package com.siren.properties.generator;

import lombok.Data;

import java.io.Serializable;

/**
 * 代码生成器 - PackageInfo相关配置
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/12
 */
@Data
public class PackageInfoProperty implements Serializable {

    private static final long serialVersionUID = -20346922559273884L;

    private String moduleName;      //模块名
    private String parent;          //自定义包路径
    private String controller;      //这里是控制器包名，默认web
}
