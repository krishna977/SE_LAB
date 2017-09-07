package stpack;

import junit.framework.TestCase;

public class class2Test extends TestCase {
	public void test(){
	class2 st=new class2();
	int result=st.valid1(666);
	assertEquals(2,result);
	int result1=st.valid2("mani@6");
	assertEquals(2,result1);
	int result2=st.valid3(645);
	assertEquals(2,result2);
	int result3=st.valid4(2017);
	assertEquals(2,result3);
	int result4=st.valid5("Deposit");
	assertEquals(2,result4);
	}
}