package org.naren.kadiri.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters1()")
	public void loggingAdvice(JoinPoint jpoiPoint) {
		// System.out.println("Advice get method called: " + jpoiPoint.toString());
	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	@Before("args(name)")
	public void StringArguments(String name) {
		System.out.println("A metod that takes String arguments has been called: " + name);
	}

	@Pointcut("within(org.naren.kadiri.model.Circle)")
	public void allGetters1() {
	}

}
