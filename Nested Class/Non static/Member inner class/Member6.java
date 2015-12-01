class Member6 
{
	public static void main(String[] args) 
	{
		Member6 obj=new Member6();
		obj.makeInner();
	}

	void makeInner()
	{
		Inner obj1=new Inner();
		obj1.toofan();
	}			

	class Inner extends Member6
	{
           void toofan()
		  {
			   System.out.println("Toofani work begins");

		  }		
	}
}
 /*   complie the file as: javac Member6.java
      run file as:         java Member6$Inner
*/