interface A2 
{
	void display();
}

class B2 implements A2 
{
	public void display()
	{
		System.out.println("Am in class B");
	}
}

class C2 extends B2
{
	public void display()
	{
		System.out.println("Am in class C");
	}

	public static void main(String... args)
	{
		A2 aRef=new C2();
		aRef.display();
		C2 bRef=(C2)aRef;
		bRef.display();
		
	}
}
