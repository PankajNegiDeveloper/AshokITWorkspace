package in.ashok.beans;

public class PetrolEngine implements IEngine {
	public PetrolEngine() {
		System.out.println("Petrol Engine :: constructor");
	}

	@Override
	public int start() {
		System.out.println("Petrol Engine started");
		return 1;
	}
}
