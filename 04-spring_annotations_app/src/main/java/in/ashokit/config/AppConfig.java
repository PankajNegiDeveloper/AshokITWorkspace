package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ashokit.entity.Driver;

@Configuration
@ComponentScan (basePackages = {"in.ashokit"})
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	@Bean //Bean is the method level annotation
	//We are creating the object for the Driver and IOC is calling the method.
	public Driver drive() {
		//logic
		Driver d = new Driver();
		return d;
	}
}
