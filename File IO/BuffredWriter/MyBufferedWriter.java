import java.io.*;
class MyBufferedWriter 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("abc.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(112);
		bw.newLine();
		bw.write("prolog");
		bw.newLine();
		bw.write("Academy");
		bw.newLine();
		char[] ch={'a','b','c'};
		bw.write(ch);
		bw.flush();
		bw.close();
	}
}
