class BaseClass1 
{
	public void methodToOverride()
	{
		System.out.println("I'm the method od Base class");
	}
}

class DerivedClass1 extends BaseClass1
{
	int a=10;
	
	public void methodToOverride()
	{
		System.out.println("I'm the method of Derived class");
	}

	public static void main(String... args)
	{
		DerivedClass1 obj1=new DerivedClass1();
		obj1.methodToOverride();
	}
}