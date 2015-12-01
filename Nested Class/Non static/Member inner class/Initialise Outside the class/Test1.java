class Member1 
{
	private int x=7;
	class Inner
	{
		int x=20;
		void seeOuter()
	    {
			System.out.println("Member1 x is "+x);
		}
	}
}

class Test1 extends Member1
{

	public static void main(String... args)
	{
			Member1.Inner obj=new Member1().new Inner();
		    obj.seeOuter();
	}
}