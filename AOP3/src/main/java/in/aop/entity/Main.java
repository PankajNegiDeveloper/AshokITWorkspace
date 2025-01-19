package in.aop.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.aop.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student stu = context.getBean(Student.class);
		int val = stu.studySomething(10, 20);
		System.out.println("Value after returning: " + val);

//		stu.doOperation();

		int rank = stu.rankOfVideo(100, 65);
		System.out.println("Video rank is: "+rank);
//		Employee emp = context.getBean(Employee.class);
//		emp.studyAnything();
	}
}
