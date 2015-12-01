class Member4
{
	private int x=7;	
	class Inner extends Member4
	{
		void seeOuter()
		{
			System.out.println(x);
		}

		void RealCheack()
		{

		}
	}
}