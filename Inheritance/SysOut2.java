class S 
{
	static Demo o=new Demo();
	 void p1()
	{
		System.out.println("S");
    }

}

class Demo
{
 
   void p()
	{
		System.out.println();
	}

	Demo()
	{
		this.p1();
    }
}

class SysOut2
{
	public static void main(String... args)
	{
		SysOut2 obj=new SysOut2();
		S.o.p();
	}
} 
