class Test
{
	Test t;
	Test() { }
	Test(Test t)
	{
		this.t=t;
	}

	void doStuff()
	{
		System.out.println("NOn-Sysnchronized");
		synchronized(t)
		{
			System.out.println("Synchronized");
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

public class TestSynchronizedBlock1 
{
	public static void main(String[] args) 
	{
		Test obj1=new Test();
		Test obj2=new Test(obj1);
		MyThread1 t1=new MyThread1(obj1);
		MyThread2 t2=new MyThread2(obj2);
		t1.start();
		t2.start();
	}
}
