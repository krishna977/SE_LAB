package stpack;

public class class2 {
		public int valid1(int code)
		{
		if(code>=000&& code<=999)
		{
			return 2;
		}
		return 3;
		}
		public int valid1()
		{
			return 2;
		}
		public int valid2(String pass)
		{
		int len=pass.length();	
		 if(len==6)
		{
			 return 2;
		}
		 return 3;
		}
		public int valid3(int pre)
		{
			if(pre>=200&&pre<=999)
			{
				return 2;
			}
			return 3;
		}
		public int valid4(int suf)
		{
			int i=0,x;
			while(suf!=0)
			{
				x=suf;
				i++;
				suf=x/10;
			}
			if(i==4)
			{
				return 2;
			}
			return 3;
		}
		public int valid5(String comm)
		{
		  if(comm.equals("Deposit") || comm.equals("Withdrawl") || comm.equals("check-status"))
				    {
				    	return 2;
				    }
				    else
				    {
				    	return 3;
				    }
				    }
	}


