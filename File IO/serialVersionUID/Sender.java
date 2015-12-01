import java.io.*;
class Sender 
{
	public static void main(String[] args) throws Exception 
	{
		Dog d1=new Dog();
		FileOutputStream fos=new FileOutputStream("abc,ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
	}
}
