class S
{
  static Demo o;
    static {
		      o=new Demo();
	       }	
}

class Demo
{
    public void p(int x)
	{
		System.out.println(x);
	}

	public void p(float f)
    {
		System.out.println(f);
    }

	public void p(String string)
    {
		System.out.println(string);
	}
}

class SysOut
{
	public static void main(String[] args)
	{
		S.o.p(10);
		S.o.p(2.0f);
		S.o.p("JAHID");
	}
}