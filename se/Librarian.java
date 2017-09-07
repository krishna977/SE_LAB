package se;

import java.util.Vector;

public class Librarian {

  private String Name;

  private int phone;

  private boolean Bookstatus;

  private int rackno;

  private int nocopies;

  int[] noiss;

    public Vector  myMembers_Record;
    public Vector  issues;
    public Vector  creates;

  public void updaterecord() {
  }

  public int queries(String book_name) {
	
	  if(   book_name.equals("Na_book1") )
	  {
		System.out.println("Rack number : 1\nNumber of copies :3");
		  return 0;
	  }
	  else if(   book_name.equals("Na_book2") )
	  {
			System.out.println("Rack number : 2\nNumber of copies :4");
		  return 0;
	  }
	  else if(   book_name.equals("Na_book3") )
	  {
			System.out.println("Rack number : 3\nNumber of copies :5");
		  return 0;
	  }
	  else if(   book_name.equals("Na_book4") )
	  {
			System.out.println("Rack number : 4\nNumber of copies :6");
		  return 0;
	  }
	  else if(   book_name.equals("Na_book5") )
	  {
			System.out.println("Rack number : 5\nNumber of copies :7");
		  return 0;
	  }
	  else if(   book_name.equals("Na_book6") )
	  {
			System.out.println("Rack number : 6  \nNumber of copies :8");
		  return 0;
	  }
	  else
	  {
		  return 1;
	  }
	  
	}

  public void create() {
  }

  public void delete() {
  }

  public void newOperation() {
  }
}