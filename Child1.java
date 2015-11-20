abstract class Base1 
{
    int x=10,y=20;
	void show() 
	{
		System.out.println(x);
		System.out.println(y);
	}

	abstract void display();
}

class Child1 extends Base1
{

	void display()
	{
		System.out.println("display");
    }

	public static void main(String... args)
	{
		Child1 c1=new Child1();
		c1.show();
		c1.display();
    }
}

