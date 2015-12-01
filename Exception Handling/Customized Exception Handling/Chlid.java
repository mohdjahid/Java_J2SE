class Parent 
{
	public void method() 
	{
		System.out.println("method");
	}
}

class Child extends Parent
{
	public void method() throws InterruptedException
	{
		Thread.sleep(500);
	}
	public static void main(String... args) throws InterruptedException
	{
		new Child().method();
	}
}
