package com.siren.pojo.generator;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * 列的属性
 *
 */
@Data
public class ColumnEntity implements Serializable {
    private static final long serialVersionUID = -3882838716571008530L;
    //列名
    private String columnName;
    //列名类型
    private String dataType;
    //列名备注
    private String comments;
    
    //属性名称(第一个字母大写)，如：user_name => UserName
    private String attrName;
    //属性名称(第一个字母小写)，如：user_name => userName
    private String attrUname;
    //属性类型
    private String attrType;
    //auto_increment
    private String extra;
}
