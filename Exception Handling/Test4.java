class Test4 
{
	
	static {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Prolog");
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) 
	{
		
	}
}
