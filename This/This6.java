class This6 
{
    void method()
	{
		This6 obj1=new This6();
		this=obj1;
        this.method2();
	}

	void method2()
	{
		System.out.println("Method 2 is invocked");
	}

	public static void main(String[] args) 
	{
	   This6 obj=new This6();
	   obj.method();
	}
}
