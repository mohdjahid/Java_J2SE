class StaticOuter1 
{
	static class Inner extends StaticOuter1
	{
         Inner()
		{
			 System.out.println("Inner");
		}

		void msg()
		{
			System.out.println("Inner-msg");
		}

	}

	void msg()
		{
			System.out.println("Outer-msg");
		}
	
	public static void main(String[] args) 
	{
		StaticOuter1 obj=new StaticOuter1.Inner();
		obj.msg();

	}
	
}
