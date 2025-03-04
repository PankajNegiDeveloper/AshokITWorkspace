package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		// creating IOC container
		// Using xml approach
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Motor motor = context.getBean(Motor.class);
		motor.doWork();

		// Using programmatic approach
//		ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");
//		Motor1 motor1 = context1.getBean(Motor1.class);
//		motor1.doWork();

		// Using annotation approach
//		ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
//		Motor2 motor2 = context2.getBean(Motor2.class);
//		motor2.doWork();

		ConfigurableApplicationContext cac = (ConfigurableApplicationContext) context;
		cac.registerShutdownHook();
//		cac.close(); //directly the IOC container will be closed
		
	}
}
