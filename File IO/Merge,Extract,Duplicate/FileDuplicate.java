import java.io.*;
class FileDuplicate 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("duplicate.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String[] s;
			
			for(int i=0; (s[i]=br.readLine())!=null; i++ ) ;
		
		for(String s1:s)
			System.out.println(s1);		
				
	}
}
