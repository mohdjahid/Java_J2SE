import java.io.*;
class  Test2
{
	public static void main(String[] args) 
	{
		File f=new File("prolog");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}
}
