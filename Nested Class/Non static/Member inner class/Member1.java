class Member1
{
	private int x=7;
	
	class Inner
	{
		void seeOuter()
		{
			System.out.println("Member x is "+x);
		}
	}

	public void makeInner()
	{
		Inner in=new Inner();
		in.seeOuter();
	}

	public static void main(String[] args) 
	{
		Member1 obj=new Member1();
		obj.makeInner();
	}
}
