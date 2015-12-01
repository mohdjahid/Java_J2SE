class MyThread6 extends Thread 
{
	public void run() 
	{
		for(int i=0;i<=10;i++)
			System.out.println("run() "+i);
	}
}

class ThreadDemo6
{
	public static void main(String... args)
	{
		MyThread6 r=new MyThread6();
		Thread t=new Thread(r);
		t.start();
		   for(int i=0;i<=10;i++)
			System.out.println("main() "+i);
	}
}