import java.io.*;
class  MyFileWriter
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("abc.txt");
		fw.write(112); //int 
		fw.write("rolog \nAcademy"); // string
		fw.write('\n');
		char[] ch={'a','b','c','d'};
		fw.write(ch); // char array
		fw.flush();
		fw.close();

	}
}
