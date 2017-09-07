package stpack;

import junit.framework.TestCase;

public class stclsTest extends TestCase {
	public void test() {
		stcls st=new stcls();
		int result=st.valid1(345);
		assertEquals(2,result);
		
		
	}

}