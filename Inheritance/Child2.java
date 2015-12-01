class Dadaji
{
	Dadaji show()
	{
		System.out.println("Dadaji");
		return this;
	}
}

class Parent extends Dadaji
{
	void show()
	{
		super.show();
		System.out.println("Parent");
		//return this;
    }
}

class Child2 extends Parent
{
	void show()
	{
		super.show();
		System.out.println("Child2");
		//obj.show();
        //return this;
	}

	public static void main( String []args)
	{
		Child2 obj=new Child2();
		obj.show();
    }
}