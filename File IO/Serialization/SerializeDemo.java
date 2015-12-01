import java.io.*;
class  Emp implements Serializable
{
	int i=10;
	int j=20;  // use transient static final keywords to see the magic 
}

class SerializeDemo 
{
	public static void main(String... args) throws Exception
	{
		Emp e1=new Emp();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e2=(Emp)ois.readObject();
		
		System.out.println(e2.i+"------"+e2.j);

	}
}