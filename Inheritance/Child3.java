class Parent 
{
	Parent() 
	{
		System.out.println("Parent");
	}

	void method1()
	{

    }
		
}

class Child3 extends Parent
{
	Child3()
	{
		//Parent obj1=super();
		System.out.println(super.Parent);
    }
   
	Child3(int x)
	{
		System.out.println("1-Ar Child");
    }

	void method()
	{
	   Parent obj1=this;
	   System.out.println((Parent)obj1);
    }

	public static void main(String... args)
	{
		Child3 obj=new Child3();
	//	obj.method();
	}
}
