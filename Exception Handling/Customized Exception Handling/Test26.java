class Test26
{
	public static void main(String[] args) 
	{
		int age=Integer.parseInt(args[0]);
		if(age<25)
			throw new TooYoungException("Your age is too less to marry");
		else if(age>50)
			     throw new TooOldException("Your age is already expired");
		     else
				 System.out.println("You will get your match detail by mail");
	}
}

class TooYoungException extends RuntimeException
{
   TooYoungException(String s)
	{
	   super(s);
	}
}

class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}