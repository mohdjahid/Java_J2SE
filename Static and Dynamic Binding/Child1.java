interface A1 
{
	abstract void display(); 
}

class Child1 implements A1
{
	public void display()
	{
		System.out.println("Display");
	}

	public static void main(String... args)
	{
		Child1 obj=new Child1();
		if( obj instanceof Child1 )
			System.out.println("Instance of Child1");
		if( obj instanceof A1 )
			System.out.println("Instance of A1");
	}
}
