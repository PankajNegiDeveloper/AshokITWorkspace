package in.aop.entity;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import in.aop.exception.MyException;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Human {

//	@Before("myPointCuts()")
//	public void wakeUp(JoinPoint j) {
//		System.out.println("Good Morning... " +j.getArgs()[0]);
//	}
//
//	@After("myPointCuts()")
//	public void sleep() {
//		System.out.println("Good Night...");
//	}
//
//	@Pointcut("execution(public * study*(..))")
//	public void myPointCuts() {
//	}

	@AfterReturning(pointcut = "execution(public * study*(..))", returning = "value")
	public void wakeUp(int value) {
		System.out.println("Good Morning, study method return value is: " + value);
	}

	@AfterThrowing(pointcut = "execution(* doOperation())", throwing = "numValue")
	public void wakeUp(MyException numValue) {
		System.out.println("This is my throw exception: " + numValue);
	}

	@Around("execution(* rankOfVideo(..))")
	public Object aroundAdvice(ProceedingJoinPoint j) {
		Object[] objArgs = j.getArgs();
		return 3000;
	}
}
