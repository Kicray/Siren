package com.siren.properties.database;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/25
 */
@Data
public class DBProperty implements Serializable {
    private static final long serialVersionUID = -3648608883674463518L;

    //数据源标识
    private String uniqueResourceName;
    private String dataSourceClassName;
    private String mapperLocations;
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String initialSize;
    private String maxActive;
    private String minIdle;
    private String maxWait;
    private String poolPreparedStatements;
    private String maxPoolPreparedStatementPerConnectionSize;
    private String validationQuery;
    private String validationQueryTimeout;
    private String testOnBorrow;
    private String testOnReturn;
    private String testWhileIdle;
    private String timeBetweenEvictionRunsMillis;
    private String minEvictableIdleTimeMillis;
    private String filters;

}
