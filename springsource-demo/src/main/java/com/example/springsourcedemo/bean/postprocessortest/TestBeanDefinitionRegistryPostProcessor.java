package com.example.springsourcedemo.bean.postprocessortest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestBeanDefinitionRegistryPostProcessor
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/26 10:03
 */
@Component
public class TestBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("TestBeanDefinitionRegistryPostProcessor 子接口 BeanDefinitionRegistryPostProcessor的方法实现-================");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("TestBeanDefinitionRegistryPostProcessor 父接口 BeanFactoryPostProcessor的方法实现-================");
    }
}
