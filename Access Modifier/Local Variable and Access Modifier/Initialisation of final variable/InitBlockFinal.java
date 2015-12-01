class InitBlockFinal 
{
	final int x;
	
	InitBlockFinal()
	{
	   System.out.println(x);
	}

	{
       x=10;
	}

	public static void main(String[] args) 
	{
		new InitBlockFinal();
	}
}
