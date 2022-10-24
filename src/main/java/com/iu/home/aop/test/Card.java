package com.iu.home.aop.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Aspect
public class Card {
	
	@Before("execution(* com.iu.home.aop.test.Transport.airPlane())")
	public void before() {
		log.info("===============Before===============");
	}
	
	@After("execution(* com.iu.home.aop.test.Transport.get*())")
	public void after() {
		log.info("===============After===============");
	}
	
	@Around("execution(* com.iu.home.aop.test.Transport.take*())")
	public Object cardCheck(ProceedingJoinPoint joinPoint)throws Throwable {
		log.info("-------삑 승차-----------");
		Object obj = joinPoint.proceed();
		log.info("-------삑 하차-----------");
		return obj;
	}
	
}
