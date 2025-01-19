package in.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor1 implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor Started");
	}

	public void doWork() {
		System.out.println("Motor is pulling water");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Motor stopped");
	}

}
