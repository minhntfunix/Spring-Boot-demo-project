package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private Logger logger= Logger.getLogger(LoggingAspect.class);
	
	
	@Pointcut( "execution(* com.example.demo.controller.*.*(..))" )
	public void forController() {}
	
	@Pointcut( "execution(* com.example.demo.model.*.*(..))" )
	public void forModel() {}
	
	@Pointcut( "execution(* com.example.demo.service.*.*(..))" )
	public void forService() {}
	
	@Pointcut( "forController() || forModel() ||  forService()")
	public void demoPoint() {}
	
	@Before("demoPoint()")
	public void before (JoinPoint jp) {
		logger.info("@Before method: " + jp.getSignature().toShortString());
	}
	
}
