package tutorial8.dependency;

import org.testng.annotations.Test;

public class TestServer {

	@Test
	public void deployServer() {
		System.out.println("Deploying Server ...");
	}
	
	@Test(dependsOnMethods="deployServer")
	public void deployBackUpServer() {
		System.out.println("Deploying Backup Server ...");
	}
}
