import java.io.*;
class List1 
{
	public static void main(String[] args) 
	{
		int count=0;
		File f=new File("F:\\JAVA\\Coaching\\Inheritance");
		String[] s=f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
		}

		System.out.println(count);

	}
}
