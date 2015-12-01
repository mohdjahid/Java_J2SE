class Account 
{
	private int balance=50;
	public void withdraw(int amt) 
	{
		balance-=amt;
	}

	public int getBalance()
	{
		return balance;
	}
}

public class Acc implements Runnable
{
	Account acc=new Account();
	
	public static void main(String... args) 
	{
         Acc r=new Acc();
		 Thread t1=new Thread(r,"Lucky");
		 Thread t2=new Thread(r,"Fred");
		 t1.start();  t2.start();
	}
    
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			makeWithdrawal(10);
			if(acc.getBalance()<0)
				System.out.println("Account is overdrwan");
		}
	}

	public void makeWithdrawal(int amt)
	{
		if(acc.getBalance()>=amt)
		{
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try{	Thread.sleep(500); }
			catch(InterruptedException e) { }
		    acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+" completes withdraw");
		}
		else
			System.out.println("Not enough money for "+Thread.currentThread().getName()+" to withdraw "+acc.getBalance());

	}

}