import java.io.*;
class  MyFileReader1
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("MyFileReader.java");
		FileReader fr=new FileReader("MyFileReader.java");
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char c:ch)
		{
			System.out.print(c);
		}
	}
}
