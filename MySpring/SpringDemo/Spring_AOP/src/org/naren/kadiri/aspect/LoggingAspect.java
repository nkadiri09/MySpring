package org.naren.kadiri.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters1()")
	public void loggingAdvice(JoinPoint jpoiPoint) {
		// System.out.println("Advice get method called: " + jpoiPoint.toString());
	}

	@AfterReturning(pointcut = "args(name)", returning = "afterReturning")
	public void stringArgumentMethods(String name, String afterReturning) {
		System.out
				.println("A method takes arguments has been called: " + name + ": and Returning is: " + afterReturning);
	}

	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void stringArgumentException(String name, Exception ex) {
		System.out.println("An exception has been called " + ex);
	}

	@Around("allGetters()")
	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

		try {
			System.out.println("Before Advice");
			proceedingJoinPoint.proceed();
			System.out.println("After Advice");
		} catch (Throwable e) {
			System.out.println(" After Throwing");
		}
		System.out.println("After Finally");

	}

	/*
	 * @AfterReturning("args(name)") public void StringArguments(String name) {
	 * System.out.println("A metod that takes String arguments has been called: " +
	 * name); }
	 */

	/*
	 * @AfterThrowing("args(name)") public void exceptionAdvice(String name) {
	 * System.out.println("an exception has been throwed"); }
	 */

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	@Pointcut("within(org.naren.kadiri.model.Circle)")
	public void allGetters1() {
	}

}
