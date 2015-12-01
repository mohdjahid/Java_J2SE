class A 
{
	public synchronized void foo(B b)
	{
		System.out.println("Thread1 starts executing foo()");
		try
		{
			Thread.sleep(1000);

		}
		catch (InterruptedException e)	{ }
		System.out.println("Thread1 trying to call's B's last()");		
		b.last();
	}

	public synchronized void last()
	{
		System.out.println("Inside A this is last");
	}
}

class B 
{
	public synchronized void bar(A a)
	{
		System.out.println("Thread1 starts executing foo()");
		try
		{
			Thread.sleep(1000);

		}
		catch (InterruptedException e)	{ }
		System.out.println("Thread1 trying to call's A's last()");
		a.last();
	}

	public synchronized void last()
	{
		System.out.println("Inside A this is last");
	}
}

class Deadlock extends Thread
{
	A a=new A();
	B b=new B();
	  
	   Deadlock()
	   {
          this.start();  a.foo(b);  // Executing By main Thread
	   }
	 
	  public void run()
	  {
		  b.bar(a);                 // Executing By chil Thread
	  }
     
	 public static void main(String... args)
	{
		 new Deadlock();
	}
}
