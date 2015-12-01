class This2 
{
	int data=6;
	String name="KHAN";

	void method2(This2 obj)
	{
       int data=2;
	   String name="Pathan";
       System.out.println(obj.data+" "+obj.name);
	}

    void method1()
    {
		method2(this); // Reference of current object is passed as an argument in the method
    }

	public static void main(String[] args) 
	{
		This2 obj=new This2();
		obj.method1();
	}
}
