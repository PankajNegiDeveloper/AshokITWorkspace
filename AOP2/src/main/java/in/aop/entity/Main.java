package in.aop.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.aop.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student st = context.getBean(Student.class);
		st.studyAnthing(20, 30);

		Employee emp = context.getBean(Employee.class);
		emp.studySometing();
	}
}
