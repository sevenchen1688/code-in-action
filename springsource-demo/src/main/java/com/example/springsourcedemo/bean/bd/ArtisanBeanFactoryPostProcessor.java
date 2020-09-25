package com.example.springsourcedemo.bean.bd;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class ArtisanBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


	/**
	 * beanFactory 就是流程图中的 bdmap    BeanDefinition的map集合
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		// 取出A对应的 beanDefinition -----> 这时候bd中存放的类是A.class
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("artiSeven1");

		//ScannedGenericBeanDefinition beanDefinition1 = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("artisan1");

		// 将bd中的beanclass修改为B
//		beanDefinition.setBeanClass(ArtiSeven2.class);
		// 修改scope为多例模式
		beanDefinition.setScope("prototype");
	}
}