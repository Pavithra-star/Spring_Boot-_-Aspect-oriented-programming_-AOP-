package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPService {
    
	@Pointcut("execution(public void com.example.aop.BusinessLogic.saveEmployee())")
	public void p1() {
	}
	@Before("p1()")
	public void tX() {
		System.out.println("Tx commited");
	}
	@After("p1()")
	public void commit() {
		System.out.println("begin tx");
	}
	@AfterReturning("p1()")
	public void commitAr() {
		System.out.println("After Returning demo");
	}
	@AfterThrowing(value = "p1()",throwing = "th")
	public void commitTh(Throwable th) {
		System.out.println("after throwing demo" +th.getMessage());	}
	@Around("p1()")
	public void aroundDemo(ProceedingJoinPoint jp) {
		System.out.println("Before business method");
		try {
			jp.proceed();
		}
		catch (Throwable e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("After business method");
		
	}
}
	
	

