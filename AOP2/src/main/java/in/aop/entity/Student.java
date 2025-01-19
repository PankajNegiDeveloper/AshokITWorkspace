package in.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public int studyAnthing(int a, int b) {
		System.out.println("I am studying...");
		return 0;
	}
}
