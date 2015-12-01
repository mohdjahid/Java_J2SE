class ThreadPriorityDemo 
{
	public static void main(String[] args) 
	{
		MyThread7 t1=new MyThread7();
		t1.setPriority(10);
		t1.start();
		for(int i=0;i<10;i++)
			System.out.println("run()");
	}
}

class MyThread7 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("run()");
	}
}