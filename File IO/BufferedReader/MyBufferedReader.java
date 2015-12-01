import java.io.*;
class MyBufferedReader 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}
		br.close();
	}
}
