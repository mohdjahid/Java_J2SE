import java.io.*;
class Merger 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr1=new FileReader("abc.txt");    // input file 1
		FileReader fr2=new FileReader("xyz.txt");	 // input file 2
		BufferedReader br1=new BufferedReader(fr1);
		BufferedReader br2=new BufferedReader(fr2);
		PrintWriter  pw=new PrintWriter("pqr.txt");  // output file
		
			String s=br1.readLine();
			while(s!=null)
				{
					pw.println(s);
					s=br1.readLine();
				}
			s=br2.readLine();
			while(s!=null)
				{
					pw.println(s);
					s=br2.readLine();
				}
			br1.close();
			br2.close();
			pw.flush();
			pw.close();
	}
}
