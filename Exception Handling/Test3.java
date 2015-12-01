class Test3 
{
	Test3() throws InterruptedException
	{
       System.out.println("Constructor");
	}

    {
		Thread.sleep(500);
		System.out.println("Init-Block");
	}

	public static void main(String[] args) throws InterruptedException
	{
		new Test3();
	}
}
