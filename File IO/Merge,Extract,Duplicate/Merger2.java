import java.io.*;
class Merger2 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("F:\\JAVA\\Coaching\\File IO\\Merge,Extract,Duplicate");
		PrintWriter pw=new PrintWriter("pqr2.txt");
		String[] s=f.list();
		
		for(String s1:s)
		{
			if(s1.contains(".txt"))
			{
				System.out.println(s1);
				FileReader fr=new FileReader(s1);
				BufferedReader br=new BufferedReader(fr);
				String r=br.readLine();
				while(r!=null)
				{
					pw.println(r);
					r=br.readLine();
				}
				br.close();
			}
		}
		pw.flush();
		pw.close();
	}
}
