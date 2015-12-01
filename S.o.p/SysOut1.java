class S 
{
	static Demo o=new Demo();
}

class Demo
{
	void p(int x)
	{
		System.out.println(x);
	}
}

class SysOut1
{
	public static void main(String[] args)
	{
		S.o.p(10);
	}
}