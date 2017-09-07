package se;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		Transaction b=new Transaction();
		int result1=b.retrieve("undergraduate",1,2);;
		assertEquals(result1,0);
		 result1=b.retrieve("postgraduate",1,4);;
		assertEquals(result1,0);
		 result1=b.retrieve("research scholar",3,6);;
		assertEquals(result1,0);
		result1=b.retrieve("faculty member",6,10);;
		assertEquals(result1,0);
		Librarian lib = new Librarian();
		result1=lib.queries("Na_book2");
		assertEquals(result1,0);
		Transaction x=new Transaction();
		result1=x.msggen("undergraduate",35);
		assertEquals(result1,1);
		result1=x.msggen("postgraduate",69);
		assertEquals(result1,1);
		result1=x.msggen("research scholar",129);
		assertEquals(result1,1);
		result1=x.msggen("faculty member",200);
		assertEquals(result1,1);
	
	}

}
