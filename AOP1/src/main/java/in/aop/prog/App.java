package in.aop.prog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.aop.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student stu = context.getBean(Student.class);
		// join points
		stu.study();

		Employee emp = context.getBean(Employee.class);
		// join points
		emp.study();
	}
}
