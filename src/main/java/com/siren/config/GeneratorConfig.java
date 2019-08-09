package com.siren.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.siren.properties.generator.GlobalGeneratorProperty;

import java.io.Serializable;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/9
 */
public abstract class GeneratorConfig implements Serializable {
    private static final long serialVersionUID = -3457914494913541330L;


    public void generate(GlobalGeneratorProperty property) throws Exception{
        AutoGenerator autoGenerator = assembleConfig(property);
        setTemplateEngine(autoGenerator);
        autoGenerator.execute();
        System.out.println("模板生成成功");
    }

    public abstract AutoGenerator assembleConfig(GlobalGeneratorProperty property);
    public abstract void setTemplateEngine(AutoGenerator autoGenerator);
}
