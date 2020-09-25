package com.example.springsourcedemo.bean.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BeanTest
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/25 15:31
 */
public class BeanTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService bean = ac.getBean(TestService.class);
		System.out.println(bean.getClass().getName());
	}
}