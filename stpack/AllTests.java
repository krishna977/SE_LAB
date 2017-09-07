package stpack;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(stclsTest.class);
		suite.addTestSuite(stclsTest1.class);
		suite.addTestSuite(stclsTest2.class);
		suite.addTestSuite(stclsTest3.class);
		suite.addTestSuite(stclsTest4.class);
		//$JUnit-END$
		return suite;
	}

}