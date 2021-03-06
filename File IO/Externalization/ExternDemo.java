import java.io.*;
class  ExternDemo implements Externalizable
{
	int i,j;
	String s;

	public ExternDemo()
	{
		
	}

	ExternDemo(String s,int i,int j)
	{
		this.s=s;
		this.i=i;
		this.j=j;
	}

	public void writeExternal(ObjectOutput oo) throws IOException
	{
		oo.writeObject(s);
		oo.writeInt(i);
	}
	
	public void readExternal(ObjectInput io) throws IOException,ClassNotFoundException
	{
		s=(String)io.readObject();
		i=io.readInt();
	}

	public static void main(String[] args)  throws Exception
	{
		ExternDemo e1=new ExternDemo("Prolog",10,20);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
	
		System.out.println("De-Serialization");
	
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternDemo e2=(ExternDemo)ois.readObject();
		System.out.println(e2.s+"----"+e2.i+"---"+e2.j);
	}
}
