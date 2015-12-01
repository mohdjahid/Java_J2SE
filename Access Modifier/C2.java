package mypack1;
import mypack.*;
class C2 extends B2
{
	void msg()
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		C2 obj=new C2();
		obj.msg();
	}
}
