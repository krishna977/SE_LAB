package stpack;

import junit.framework.TestCase;

public class stclsTest2 extends TestCase {
	public void test() {
		stcls st=new stcls();
		int result2=st.valid3(456);
		assertEquals(2,result2);
	}

}