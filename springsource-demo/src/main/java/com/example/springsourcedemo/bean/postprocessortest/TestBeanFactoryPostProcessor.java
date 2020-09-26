package com.example.springsourcedemo.bean.postprocessortest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestBeanFactoryPostProcessor
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/26 10:06
 */
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("TestBeanFactoryPostProcessor 父接口 postProcessBeanFactory==================================");
    }
}
