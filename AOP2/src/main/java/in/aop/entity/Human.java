package in.aop.entity;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
	
	@Before("pointCuts()")
	public void wakeUp(JoinPoint j) {
		System.out.println("Good morning: "+j.getSignature().getName());
	}
	
	@After("pointCuts()")
	public void sleep() {
		System.out.println("Good night");
	}
	
	@Pointcut("execution(public * study*(..))")
	public void pointCuts() {
	}
}
