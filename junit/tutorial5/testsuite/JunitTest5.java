package tutorial5.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tutorial1.basic.JunitTest1;
import tutorial2.exception.JunitTest2;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	JunitTest1.class,
	JunitTest2.class
})
public class JunitTest5 {

}
