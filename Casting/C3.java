/*----------Downcasting is totally dependent on upcasting--------
  You can put reference of C to any of its it s parent reference variable
  But when you try to put reference for C in reference variable of C through the refrence variable of any of it's parent you new 
  to cast it into C------------------------------------*/

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

class C3 extends B2
{
	public void display()
	{
		System.out.println("Am in class C");
	}

	public static void main(String... args)
	{
		A2 aRef=new C3();
		C3 bRef=(C3)aRef;
		aRef.display();		
		System.out.println(aRef);
	}
}
