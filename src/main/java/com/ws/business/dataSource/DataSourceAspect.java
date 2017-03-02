package com.ws.business.dataSource;

import com.ws.business.properties.PropertiesUtils;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


/**
 * Created by bbtree on 2017/3/1.
 */
public class DataSourceAspect implements MethodBeforeAdvice,AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        DataSourceContextHolder.clearDataSourceType();
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        if (method.isAnnotationPresent(DataSource.class))
        {
            DataSource datasource = method.getAnnotation(DataSource.class);
            DataSourceContextHolder.setDataSourceType(datasource.value());
        }
        else
        {
            DataSourceContextHolder.setDataSourceType(DynamicDataSource.getDefaultDataSourceName());
        }
    }
}
