class MyThread extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Lazy Thread");
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
			}
		}
	}
}

public class Test
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.setDaemon(true);
		t.start();
		System.out.println("End of main()");
	}
}
