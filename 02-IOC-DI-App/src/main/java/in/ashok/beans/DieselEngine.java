package in.ashok.beans;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("Diesel Engine :: constructor");
	}

	@Override
	public int start() {
		System.out.println("Diesel Engine started");
		return 1;
	}
}
