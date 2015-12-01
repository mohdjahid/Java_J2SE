class A1 
{
	void show() 
	{
		System.out.println("A1");
	}
}

class B1 
{
	A1 a=new A1();
	void show()
	{
		System.out.println("B2");
    }
}

class C1
{
	B1 b=new B1();
	void show()
	{
		b.a.show();
		System.out.println("C1");
    }
    
	public static void main(String...args)
	{
		C1 c=new C1();
		c.show();
    }
}