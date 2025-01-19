package in.ashokit.beans;

//Motor is represent as a spring bean
//Motor scope is singleton
public class Motor { 

	public Motor() {
		System.out.println("Motor :: Constructor");
	}

	public void start() {
		System.out.println("Motor started");
	}

	public void doWork() {
		System.out.println("Motor pulling water");
	}

	public void stop() {
		System.out.println("Motor stopped");
	}
}
