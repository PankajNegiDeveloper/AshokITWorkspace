package in.ashokit;

public class PetrolEng implements IEngine{

	@Override
	public int start() {
		System.out.println("Petrol Engine started");
		return 1;
	}

}
