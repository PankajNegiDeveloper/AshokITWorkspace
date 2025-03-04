package in.ashok.beans;

public class Car {

	private IEngine eng;

	public void setEng(IEngine eng) {
		System.out.println("setEng() method called");
		this.eng = eng;
	}
	
	public Car() {
		System.out.println("Car :: Non-Parameterized constructor");
	}

	public Car(IEngine eng) {
		System.out.println("Car :: Parameterized constructor");
		this.eng = eng;
	}

	public void drive() {
		int status = eng.start();
		if (status >= 1) {
			System.out.println("Car is started");
		} else {
			System.out.println("Engine failure");
		}
	}
}
