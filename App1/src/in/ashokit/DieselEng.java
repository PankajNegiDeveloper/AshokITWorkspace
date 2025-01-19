package in.ashokit;

public class DieselEng implements IEngine {

	@Override
	public int start() {
		System.out.println("diesel engine stared");
		return 1;
	}

}
