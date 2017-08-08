package org.naren.kadiri.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters1()")
	public void loggingAdvice(JoinPoint jpoiPoint) {
		// System.out.println("Advice get method called: " + jpoiPoint.toString());
	}
	
	@AfterReturning(pointcut="args(name)", returning="afterReturning")
	public void stringArgumentMethods(String name, String afterReturning) {
		System.out.println("A method takes arguments has been called: "+name +": and Returning is: "+afterReturning);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void stringArgumentException(String name, Exception ex) {
		System.out.println("An exception has been called "+ex);
	}
	
/*	@AfterReturning("args(name)")
	public void StringArguments(String name) {
		System.out.println("A metod that takes String arguments has been called: " + name);
	}*/

	/*@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) {
		System.out.println("an exception has been throwed");
	}*/

	@Pointcut("within(org.naren.kadiri.model.Circle)")
	public void allGetters1() {
	}

}
