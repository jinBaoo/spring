package com.demo.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
//声明切面
public class NotVeryUsefulAspect  {

	@Pointcut("execution(* com.demo.service.Aservice.*(..))")
	public void anyPublicMethod() { //声明切点

	}
	@Before("anyPublicMethod()")
	public void before() {
		System.out.println("----aop----");
	}
}
