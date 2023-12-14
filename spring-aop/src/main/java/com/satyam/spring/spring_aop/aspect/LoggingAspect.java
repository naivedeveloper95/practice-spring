package com.satyam.spring.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.satyam.spring.spring_aop.ProductServiceImpl.multiple(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before calling the method.");
	}

	@After("execution(* com.satyam.spring.spring_aop.ProductServiceImpl.multiple(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After calling the method.");
	}
}
