package tutorial2.exception;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * In this example, 
 * the divisionWithException() method will throw an ArithmeticException Exception, 
 * since this is an expected exception, so the unit test will pass.
 * @author jezhang
 *
 */
public class JunitTest2 {

	@Test(expected=ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 0 ;
	}

}
