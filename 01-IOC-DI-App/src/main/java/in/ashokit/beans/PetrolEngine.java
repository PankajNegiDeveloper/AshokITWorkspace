package in.ashokit.beans;

public class PetrolEngine implements IEngine{
	
	public PetrolEngine() {
		System.out.println("PetrolEngine::Constructor");
	}

	@Override
	public int start() {
		System.out.println("Petrol engine started");
		return 1;
	}

}
