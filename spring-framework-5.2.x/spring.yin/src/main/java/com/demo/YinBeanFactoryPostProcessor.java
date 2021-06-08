package com.demo;

import com.demo.service.BService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

//@Component
public class YinBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		GenericBeanDefinition  aservice = (GenericBeanDefinition) beanFactory.getBeanDefinition("aservice");
		aservice.setBeanClass(BService.class);
	}
}
