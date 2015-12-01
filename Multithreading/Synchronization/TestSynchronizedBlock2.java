class MyThread1
{
	static
             {
                  synchronized(TestSynchronizedBlock2.class)
                       {
				
                       }
			 }	
}




public class TestSynchronizedBlock2 
{
	public static void main(String[] args) 
	{
		Test obj1=new Test();
		MyThread1 t1=new MyThread1(obj1);
	    MyThread2 t2=new MyThread2(obj1);
		t1.start();
		t2.start();
		
	}
}
