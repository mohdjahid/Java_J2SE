class A1
{
	static int i=1111;
	static 
	{
		i=i-- - --i;
	}
	{
		i=i++ + ++i;
	}
}
class B1 extends A1
{
	static 
	{
		i=--i - i--;
	}
	{
		i=++i + i++;
	}
}
class Exp 
{
	public static void main(String[] args) 
	{
		B1 b=new B1();
		System.out.println(b.i);
	}
}
