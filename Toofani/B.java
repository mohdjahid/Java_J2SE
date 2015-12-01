class A1
{

}

class A extends A1
{
    A(int x)
	{
		System.out.println("A");
	}
	{
        System.out.println("inti-A");   
	}
}

class B extends A
{	
	B()
	{
		this(10);
		System.out.println("B2");
	}

	B(int x)
	{
		super(10);
		System.out.println("HAHAHA");
	}

	public static void main(String[] args) 
	{
		 new A1();
	}
}
