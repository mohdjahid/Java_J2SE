class MyThread8 extends Thread 
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			Thread.yield();
			Thread.yield();Thread.yield();Thread.yield();
			System.out.println("run()");
		}
	}
}

class ThreadYieldDemo
{
    public static void main(String[] args) 
	{
		MyThread8 t1=new MyThread8();
		t1.start();
		for(int i=0;i<=10;i++)
			System.out.println("main()");
	}
}