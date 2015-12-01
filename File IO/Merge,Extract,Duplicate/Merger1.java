import java.io.*;
class Merger1 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr1=new FileReader("abc.txt");    // input file 1
		FileReader fr2=new FileReader("xyz.txt");	 // input file 2
		BufferedReader br1=new BufferedReader(fr1);
		BufferedReader br2=new BufferedReader(fr2);
		PrintWriter  pw=new PrintWriter("pqr1.txt");  // output file	
			String s1=br1.readLine();
			String s2=br2.readLine();
			while(s1!=null || s2!=null)
				{
					if(s1!=null)
					{
						pw.println(s1);
						s1=br1.readLine();
					}
				    if(s2!=null)
					{
						pw.println(s2);
						s2=br2.readLine();
					}
				}
			br1.close();
			br2.close();
			pw.flush();
			pw.close();
	}
}
