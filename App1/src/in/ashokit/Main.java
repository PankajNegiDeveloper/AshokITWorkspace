package in.ashokit;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car(new DieselEng()); // constructor injection

		car1.setEng(new PetrolEng()); // setter injection
		car1.drive(); //constructor inject will execute first, but setter injection will override constructor engine
		//so, PetrolEng will be executed
	}

}
