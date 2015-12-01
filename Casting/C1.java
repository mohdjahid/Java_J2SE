interface A1 
{
	void display();
}

class B1 implements A1
{
	public void display()
	{
		System.out.println("Am in class B");
	}
}

class C1 extends B1
{
	public void display()
	{
		System.out.println("Am in class C");
	}

	public static void main(String... args)
	{
		A1 aRef=new C1(); // Upcasting Parent reference variable = child reference
		aRef.display();
	}
}
