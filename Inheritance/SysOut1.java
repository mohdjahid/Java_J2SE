class Static 
{
	static Demo obj=new Demo();

	void Static()
	{
       System.out.println("Static");
    }

}

class Demo
{
   void Demo()
	{
		System.out.println("Demo");
	}
}

class SysOut1
{
	public static void main(String... args)
	{
		Static.obj.Demo();
	}
} 

