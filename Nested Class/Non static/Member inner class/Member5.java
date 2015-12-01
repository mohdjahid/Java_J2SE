interface Member3
{
	abstract void realCheck();
	
	class Inner
	{
		void seeOuter()
		{
	        System.out.println("seeOuter");		
		}
		void realCheck()
		{
            System.out.println("RealCheck");
		}
	}
}

class Member5 implements Member3
{
	public void realCheck() { }
	public static void main(String... args)
	{	 
	  Member3.Inner obj=new Inner();
      obj.seeOuter();
	  obj.realCheck();
	}
}