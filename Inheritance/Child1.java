//Use of super to call method of intermediate class
class Parent 
{
	void show() 
	{
		System.out.println("Parent");
	}
	
}

class Child1 extends Parent
{
	void show()
	{
		super.show();
		System.out.println("Child1");
    }
	
	public static void main(String[] args)
	{
		Child1 obj=new Child1();
		obj.show();
    }
}