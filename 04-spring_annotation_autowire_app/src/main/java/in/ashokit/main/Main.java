package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.service.Report;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Report pdf = context.getBean(Report.class);
		pdf.generate();
	}
}
