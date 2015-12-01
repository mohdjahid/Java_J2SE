class ThreadPriorityDemo 
{
	public static void main(String[] args) 
	{
		MyThread7 t1=new MyThread7();
		Thread.currentThread().setPriority(1);
		t1.setPriority(10); t1.start();
		System.out.println(t1.getName());
		for(int i=0;i<=10;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
 
class MyThread7 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
			System.out.println("run()");
	}
}