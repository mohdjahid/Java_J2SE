/*-----------Main method also get inherited and raseults in overridden--------------------*/

abstract class A4 
{
	abstract void display();
	public void show()
	{
		S.o.p("A1");
	}

	public static void main(String[] args)
	{
		A4 obj=new C4();	//Upcasting
		obj.display();
	}		
}

class C4 extends A4
{
	void display()
	{
		S.o.p("Display");
	}

	void display1()
	{
		S.o.p("Display1");
	}	
		
    public static void main(String[] args)  //Erase this main method and run the program as java C4 
	{
		A4 obj=new C4();	//Upcasting
		obj.show();
	}	
}

