import java.util.*;
import java.io.*;
public class PropertiesDemo
{
	public static void main(String... args) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fin=new FileInputStream("abc.properties");
		p.load(fin);
		System.out.println(p);
		
		String s=p.getProperty("jahid");
		System.out.println(s);

		p.setProperty("nahid","1111");
		
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos,"updated by JAHID at Night");
	}
}