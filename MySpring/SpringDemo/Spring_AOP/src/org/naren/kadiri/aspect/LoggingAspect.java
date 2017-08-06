package org.naren.kadiri.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Advice get method called");
	}

	@Before("allGetters()")
	public void secoundLogic() {
		System.out.println("secound logging get method called");
	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

}
