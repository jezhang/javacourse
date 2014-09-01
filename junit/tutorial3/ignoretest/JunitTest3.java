package tutorial3.ignoretest;

import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

public class JunitTest3 {

	@Ignore("Not Ready to Run")
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
