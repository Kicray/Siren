package com.siren.properties.generator;

import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import lombok.Data;

import java.io.Serializable;

/**
 * 代码生成器 - Strategy相关配置
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/12
 */
@Data
public class StrategyProperty implements Serializable {
    private static final long serialVersionUID = 7877036273454966451L;

    /***策略配置***/
    private boolean capitalMode;             //全局大写命名
    private boolean dbColumnUnderline;       //全局下划线命名
    private String [] tablePrefix;           //表前缀
    private NamingStrategy naming;           //表名生成策略
    private String superEntityClass;         //自定义实体父类

    /**mapper service controller**/
    private String superMapperClass;         //自定义mapper父类
    private String superServiceClass;        //自定义service父类
    private String superServiceImplClass;    //自定义service 实现父类
    private String superControllerClass;     //自定义controller父类

    /**构建模型 二选一**/
    private boolean entityBuilderModel;      //是否为构建者模型 get set
    private boolean entityLombokModel;       //是否为lombok模型 @Data

    /****/
    private boolean entityBooleanColumnRemoveIsPrefix; //Boolean类型字段是否移除is前缀
    private boolean restControllerStyle;
    private boolean controllerMappingHyphenStyle;

}
