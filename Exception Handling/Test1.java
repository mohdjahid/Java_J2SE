class Test1 
{
	public static void main(String[] args) 
	{
	  OUTER:
	  {
		try
		{
			//if(1==1)
			break OUTER;
			//System.out.println(10/0);

		}
		catch (ArithmeticException e)
		{
			System.out.println ("catch");
			break OUTER;
		}
		finally
		{
			System.out.println ("finally");
		}
		//System.out.println ("Block");
	 }
	}
}
