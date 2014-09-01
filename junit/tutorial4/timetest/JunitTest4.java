package tutorial4.timetest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest4 {

	@Test(timeout = 1000)
	public void infinity() { 
		while(true);
	}

}
