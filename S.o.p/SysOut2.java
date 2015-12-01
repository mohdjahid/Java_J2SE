class S 
{
	static Demo o=new Demo(10);
}

class Demo
{
	int x;
	
	void p(int x)
	{
		System.out.println(x);
    }

    Demo(int x)
	{
		this.x=x;
	}
}

class SysOut2
{
     public static void main(String args[])
	  {
        S.o.p(20);

      }
}