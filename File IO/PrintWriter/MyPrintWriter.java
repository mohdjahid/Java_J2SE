import java.io.*;
class MyPrintWriter 
{
	public static void main(String[] args) throws IOException 
	{
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.write(100);                              // pw.newLine(); has private acess in PrintWriter
		pw.println("prolog");
		pw.println(true);
		char[] ch={'a','b','c'};
		pw.println(ch);
		pw.println(10.5);
		pw.flush();
		pw.close();
	}
}
