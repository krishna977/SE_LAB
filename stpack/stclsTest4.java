package stpack;

import junit.framework.TestCase;

public class stclsTest4 extends TestCase {
	public void test() {
		stcls st=new stcls();
		int result4=st.valid5("deposit");
		assertEquals(2,result4);
	}

}