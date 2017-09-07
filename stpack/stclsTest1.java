package stpack;

import junit.framework.TestCase;

public class stclsTest1 extends TestCase {
	public void test() {
		stcls st=new stcls();
		int result1=st.valid2("mani@6");
		assertEquals(2,result1);
		
	}

}