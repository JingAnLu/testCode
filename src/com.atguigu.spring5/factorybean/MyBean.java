package com.atguigu.com.atguigu.spring5.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Jonathan
 * @description
 * @create 2021-02-26 20:49
 */
public class MyBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
