abstract class Member2
{
	private int x=7;
	abstract void RealCheck();
	
	class Inner
	{
		void seeOuter()
		{
			System.out.println("Member x is "+x);
		}
		void RealCheack()
		{

		}
	}

	public void makeInner()
	{
		Inner in=new Inner();
		in.seeOuter();
	}

	public static void main(String[] args) 
	{

	}
}
