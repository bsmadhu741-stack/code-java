class YouTube
{
	public boolean login(String username,String psw)
	{
		System.out.println("Invoking login using username :" +username+  " and password : " +psw);
		boolean isLogin=false;
		String regusername="Madhubhavana";
		String regpsw="Madhubhavana@19";
		
		if(username == regusername && psw == regpsw)
		{
			isLogin=true;
		}
		else
		{
			isLogin=false;
		}
		return isLogin;
	}
	
	public String login(String emailId,String psw,String captcha)
	{
		System.out.println("Invoking login using email id :" +emailId+ " and password :" +psw);
		String msg=null;
		String regemailId="bsmadhu741@gmail.com";
		String regpsw="Madhubhavana@19;
		
		if(emailId == regemailId && psw == regpsw)
		{
			msg="login successful";
		}
		else
		{
			msg="login failed";
		}
		return msg;
	}
	
	public String search(String movieName)
	{
		System.out.println("Invoking search by movie name :" +movieName);
		String msg=null;
		
		if(movieName!=null)
		{
			msg="Searched movie name :" +movieName+ " is available";
		}
		return msg;
	}
	
	public String search(String movieName,String heroName)
	{
		System.out.println("Invoking search by movie name :" +movieName+ " and hero name :" +heroName);
		String msg=null;
		
		if(movieName!=null && heroName!=null)
		{
			msg="searched movie name :" +movieName+ " and hero name :" +heroName+ " is available";
		}
		return msg;	
	}
}