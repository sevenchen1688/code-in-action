package com.example.springsourcedemo.bean.postprocessortest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName InvokeTestBeanFactoryPostProcessorTest
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/26 10:09
 */
public class InvokeTestBeanFactoryPostProcessorTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
