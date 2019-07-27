package com.siren.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import com.siren.properties.database.DBProperty;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.Serializable;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/27
 */
public abstract class SirenDBConfig implements Serializable {
    private static final long serialVersionUID = 5567376383018848160L;
    private static final Logger logger = LoggerFactory.getLogger(SirenDBConfig.class);

    protected DataSource dataSource(DBProperty dbProperty) {
        DruidDataSource ds = new DruidDataSource();
        ds.setUrl(dbProperty.getUrl());
        ds.setUsername(dbProperty.getUsername());
        ds.setPassword(dbProperty.getPassword());
        ds.setDriverClassName(dbProperty.getDriverClassName());
        ds.setInitialSize(Integer.parseInt(dbProperty.getInitialSize()));
        ds.setMaxActive(Integer.parseInt(dbProperty.getMaxActive()));
        ds.setMinIdle(Integer.parseInt(dbProperty.getMinIdle()));
        ds.setMaxWait(Integer.parseInt(dbProperty.getMaxWait()));
        ds.setPoolPreparedStatements(Boolean.valueOf(dbProperty.getPoolPreparedStatements()));
        ds.setMaxPoolPreparedStatementPerConnectionSize(Integer.parseInt(dbProperty.getMaxPoolPreparedStatementPerConnectionSize()));
        ds.setValidationQuery(dbProperty.getValidationQuery());
        ds.setValidationQueryTimeout(Integer.parseInt(dbProperty.getValidationQueryTimeout()));
        ds.setTestOnBorrow(Boolean.valueOf(dbProperty.getTestOnBorrow()));
        ds.setTestOnReturn(Boolean.valueOf(dbProperty.getTestOnReturn()));
        ds.setTestWhileIdle(Boolean.valueOf(dbProperty.getTestWhileIdle()));
        ds.setTimeBetweenEvictionRunsMillis(Integer.parseInt(dbProperty.getTimeBetweenEvictionRunsMillis()));
        ds.setMinEvictableIdleTimeMillis(Integer.parseInt(dbProperty.getMinEvictableIdleTimeMillis()));
        ds.setUseGlobalDataSourceStat(true);
        try {
            ds.setFilters(dbProperty.getFilters());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("druid configuration initialization filter", e);
        }
        return ds;
    }

    protected SqlSessionFactory sqlSessionFactory(DataSource dataSource, String mapperLocations) throws Exception{
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setIdType(2);
        globalConfiguration.setDbColumnUnderline(true);

        MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
        bean.setGlobalConfig(globalConfiguration);
        return bean.getObject();
    }

    protected SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
