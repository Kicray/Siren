package com.siren.properties.generator;

import lombok.Data;

import java.io.Serializable;

/**
 * 代码生成器-环境属性配置
 *
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/9
 */
@Data
public class GlobalGeneratorProperty implements Serializable {

    private static final long serialVersionUID = 1046140708817127424L;

    /********全局配置*********/
    private String outPutDir;           //输出目录
    private String author;              //作者
    private boolean fileOverride;       //是否覆盖文件
    private boolean activeRecord;       //开启activeRecord模式
    private boolean enableCache;        //XML 二级缓存
    private boolean baseResultMap;      //XML ResultMap
    private boolean baseColumnList;     //XML columList
    private boolean kotlin;             //是否生成kotlin代码

    // 自定义文件命名
    private String entityName;
    private String mapperName;
    private String xmlName;
    private String serviceName;
    private String serviceImplName;
    private String controllerName;
}
