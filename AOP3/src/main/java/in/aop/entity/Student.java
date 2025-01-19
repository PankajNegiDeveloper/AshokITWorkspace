package in.aop.entity;

import org.springframework.stereotype.Component;

import in.aop.exception.MyException;

@Component
public class Student {
	public int studySomething(int a, int b) {
		System.out.println("I am studying something");
		return 100;
	}
	
	public int doOperation() {
		throw new MyException("This is my custom exception!!");
	}
	
	public int rankOfVideo(int views, int watchtime) {
		return (views*watchtime - (views+watchtime));
	}
}
