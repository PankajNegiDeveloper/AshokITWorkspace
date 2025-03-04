package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.entity.Motor;

public class MainApp {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext();

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Motor motor1 = context.getBean(Motor.class);
		System.out.println(motor1.hashCode());

		Motor motor2 = context.getBean(Motor.class);
		System.out.println(motor2.hashCode());
	}

}
