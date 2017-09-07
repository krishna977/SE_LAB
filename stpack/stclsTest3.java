package stpack;

import junit.framework.TestCase;

public class stclsTest3 extends TestCase {
	public void test() {
		stcls st=new stcls();
		int result3=st.valid4(4567);
		assertEquals(2,result3);
	}

}