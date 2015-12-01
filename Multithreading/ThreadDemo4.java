class MyThread4 extends Thread 
{
	public void start()
	{
		super.start();
		for(int i=0;i<=5;i++)
			System.out.println("start()");
	}

	public void run() 
	{
		for(int i=0;i<=5;i++)
		    System.out.println("run()");
	}
}

class ThreadDemo4
{
	public static void main(String... args)
	{
		MyThread4 t=new MyThread4();
		t.start();
		for(int i=0;i<=5;i++)
			System.out.println("Main method()");
	}
}