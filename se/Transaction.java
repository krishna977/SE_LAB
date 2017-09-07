package se;

import java.util.Vector;

public class Transaction {

  private int Transid;

  private int memberId;
  private String name;
private int amount;
  private int ISBNno;

  private int Issuedate;

  private int duedate;

  public int trans;

    public Vector  creates;
    public Vector  refers;
    public Vector  sends_msg;

  public void create() {
  }

  public void delete() {
  }

  public void retrieve() {
  }

  public int msggen(String name,int duedate) {
	  if(name.equals("undergraduate"))
		{
		  int time;
			if(duedate>30)
			{
				time=duedate-30;
				time*=2;
				System.out.println("penalty for overdue:"+time);
			return 1;
			}
			else{
				return 0;
				}
		}
		else if(name.equals("postgraduate"))
		{
			  int time;
				if(duedate>30)
				{
					time=duedate-30;
					time*=2;
					System.out.println("penalty for overdue:"+time);
				return 1;
				}
				else{
					return 0;
					}

		}
		else if(name.equals("research scholar"))
		{
			  int time;
				if(duedate>90)
				{
					time=duedate-90;
					time*=2;
					System.out.println("penalty for overdue:"+time);
				return 1;
				}
				else{
					return 0;
					}

		
		}
		else if(name.equals("faculty member"))
		{
			  int time;
				if(duedate>120)
				{
					time=duedate-120;
					time*=2;
					System.out.println("penalty for overdue:"+time);
				return 1;
				}
				else{
					return 0;
					}
		}
		
	return 0;
  }
	  
  

public int retrieve(String name, int dur, int no_of_books) {
	// TODO Auto-generated method stub
		if(name.equals("undergraduate"))
		{
			if(dur<=1 && no_of_books <=2)
				return 0;
			else
				return 1;
		}
		else if(name.equals("postgraduate"))
		{
			if(dur<=1 && no_of_books <=4)
				return 0;
			else
				return 1;			
		}
		else if(name.equals("research scholar"))
		{
			if(dur<=3 && no_of_books <=6)
				return 0;
			else
				return 1;
		}
		else if(name.equals("faculty member"))
		{
			if(dur<=6 && no_of_books <=10)
				return 0;
			else
				return 1;
		}
		
	return 0;
}

}