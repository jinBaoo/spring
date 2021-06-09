package com.demo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class X  implements ApplicationContextAware, BeanNameAware, InitializingBean {

	@Autowired
	X x;

	public X() {
		System.out.println("x 构造器");
	}
	@PostConstruct
	public void initAnno() {
		System.out.println("callback。。。。。。。。。");
	}

	@Override
	public void setBeanName(String name) {

		System.out.println("setBeanName。。。。。");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet。。。");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext。。。。");
	}
}
