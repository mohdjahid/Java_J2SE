class MyThread9 extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("MyThread");
	}
}

class ThreadJoinDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread9 t1=new MyThread9();
		t1.start();  t1.join();
		for(int i=0;i<10;i++)
			System.out.println("main");
	}
}