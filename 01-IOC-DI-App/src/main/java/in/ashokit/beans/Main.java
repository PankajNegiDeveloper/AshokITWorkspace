package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// starting IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
