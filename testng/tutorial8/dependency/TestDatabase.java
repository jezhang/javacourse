package tutorial8.dependency;

import org.testng.annotations.Test;

public class TestDatabase {

	@Test(groups="db", dependsOnGroups="deploy")
	public void initDB() {
		System.out.println("This is initDB()");
	}
	
	@Test(dependsOnMethods={"initDB"}, groups="db")
	public void testConnection() {
		System.out.println("This is test connection()");
	}
}
