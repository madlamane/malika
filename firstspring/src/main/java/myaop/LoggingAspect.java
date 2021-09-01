package myaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* CustomerBO.add*(..))")
	public void logBefore(JoinPoint joinPoint) {// can be used to get all information
		// about method for which you using advices
		System.out.println("logBefore() is running!");
		System.out.println("hijacked : ");
		Object o[] = joinPoint.getArgs();

		if (o.length != 0) {
			System.out.println("REsult is " + o[0]);
			System.out.println("total no of argument is " + o.length);
		}
		System.out.println("******");
	}

	@After("execution(* CustomerBO.addCustomer(..))")//||execution( LoginValid.valid(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("*******");
		System.out.println("logAfter() is running!");
		
	}

}
