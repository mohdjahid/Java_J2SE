abstract class Base2 
{
   int x=20;
   
   Base2()
	{
	   System.out.println("B1");
	}	

	 void show()
	{
		 System.out.println(x);
    }

	 public static void main(String... args)
	{
		Base2 b1=new Child2();
		b1.show();
    } 
}

class Child2 extends Base2
{
	int x=10;

	Child2()
	{
		System.out.println("C1");
    }	
}
