package tutorial4.ignore;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class TestIgnore {
	
	@Test
	public void test1() {
		Assert.assertEquals(true, true);
	}
	
	@Test(enabled = true)
	public void test2() {
		Assert.assertEquals(true, true);
	}
	
	@Test(enabled = false)
	public void test3() {
		Assert.assertEquals(true, true);
	}

}
