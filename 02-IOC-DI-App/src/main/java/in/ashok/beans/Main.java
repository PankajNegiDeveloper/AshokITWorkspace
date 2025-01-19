package in.ashok.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//starting IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Car bean = context.getBean(Car.class);
		bean.drive();
	}

}
