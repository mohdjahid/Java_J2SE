//Data hiding
class Dadaji 
{
	int x=50;
}

class Parent extends Dadaji
{
	int x=40;
}

class Child extends Parent
{
	int x=30;
	void show()
	{
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(((Dadaji)this).x);
    }

 public static void main(String... args)
	{
	  Child obj=new Child();
    }
}