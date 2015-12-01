// count the number of files 
import java.io.*;
class List2 
{
	public static void main(String[] args) 
	{
		int count=0;
		File f=new File("F:\\JAVA\\Coaching\\Inheritance");
		String[] s=f.list();
		for(String s1:s)
		{
			File f1=new File(f,s1);
			if(!f1.isDirectory())  // f1.isFile();
			{
				count++;
				System.out.println(s1);
			}
		}

		System.out.println(count);

	}
}
