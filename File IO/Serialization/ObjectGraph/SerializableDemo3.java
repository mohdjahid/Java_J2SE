/*---------------Object Graph--------------------*/
import java.io.*;
class Dog implements Serializable
{
	Cat c=new Cat();
}

class Cat implements Serializable
{
	Rat r=new Rat();
}

class Rat implements Serializable
{
	int i=10;
}

class SerializableDemo3 
{
	public static void main(String[] args) throws Exception 
	{
		//    Serialization
		Dog d1=new Dog();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		//    De-Serialization
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		
		System.out.println(d2.c.r.i);


	}
}
