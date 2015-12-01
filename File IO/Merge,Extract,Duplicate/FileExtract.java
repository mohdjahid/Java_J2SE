import java.io.*;
class FileExtract 
{
	public static void main(String[] args) throws IOException
	{
		FileReader	fr1=new FileReader("op1.txt"); //input file 1
		
		BufferedReader br1 =new BufferedReader(fr1);
		
		PrintWriter pw=new PrintWriter("op3.txt");
		String s1=br1.readLine();					// read from input file 1
		
	
		boolean check=false;
		while(s1!=null)
		{			
			FileReader	fr2=new FileReader("op2.txt"); //input file 2
			BufferedReader br2=new BufferedReader(fr2);			
			String r=br2.readLine();
			while(r!=null)                       // r contains all string for file 2
			{
				if(s1.equals(r))
				{
					check=true;                  // found
				}
				r=br2.readLine();
			}

			br2.close();

			if(check==false)                     // not found
			{
				pw.println(s1);
			}
			
			s1=br1.readLine();                  // read next string from file 1
			check=false;
		}
		br1.close();
		pw.flush();
		pw.close();
	}
}
