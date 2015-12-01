class X 
{
    private X() {	}

	static X method()
	{
		X obj=new X();
		return obj;
	}

	public void display()
	{
		System.out.println("I HAVE LEARNED SOMETHING NEW");
	}
}

class PrivateConstInst
{	
	Y()
	{
		System.out.println("B2");
	}

	public static void main(String[] args) 
	{
		 X obj=X.method();
		 obj.display();
	}
}
