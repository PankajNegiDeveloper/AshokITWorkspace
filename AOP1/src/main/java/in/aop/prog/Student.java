package in.aop.prog;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public void study() {
//		new Human().wakeUp();
		System.out.println("I am studying...");
	}
}
