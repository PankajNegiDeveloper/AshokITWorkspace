package in.ashokit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Motor2 {

	public Motor2() {
		System.out.println("Motor :: Constructor");
	}

	@PostConstruct
	public void start() {
		System.out.println("Motor started");
	}

	public void doWork() {
		System.out.println("Motor pulling water");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Motor stopped");
	}
}
