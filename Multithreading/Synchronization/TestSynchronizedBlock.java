class Test
{	
	void doStuff()
	{
		System.out.println("Not synchronized");
		synchronized(this)
		{
			System.out.println(Thread.currentThread().getName()+"synchronized");
			System.out.println(Thread.currentThread().getName()+"synchronized2");
		}
	}
}

class MyThread1 extends Thread
{
	Test t;
	MyThread1(Test t)
	{
		this.t=t;
	}

	public void run() 
	{
		t.doStuff();
		
	}
}
class MyThread2 extends Thread
{
	Test t;
	MyThread2(Test t)
	{
		this.t=t;
	}

	public void run()
	{
		t.doStuff();
	}
}

public class TestSynchronizedBlock 
{
	public static void main(String[] args) 
	{
		Test obj=new Test();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
