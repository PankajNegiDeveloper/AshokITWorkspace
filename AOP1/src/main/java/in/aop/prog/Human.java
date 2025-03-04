package in.aop.prog;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

	// will run everytime before study(), whenever study() is called
	@Before("execution(public void study())")
	// will run only before Employee method, study()
	// @Before("execution(public void in.aop.prog.Employee.study())")
	public void wakeUp() {
		System.out.println("Good morning");
	}

	@After("execution(public * study*())")
	public void sleep() {
		System.out.println("Good night");
	}
}
