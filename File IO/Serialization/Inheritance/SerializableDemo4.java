import java.io.*;
class Animal implements Serializable
{
	int j=20;
}

class Dog extends Animal
{
	int i=10;
}

class SerializableDemo4 
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
		
		System.out.println(d2.i+"------------"+d2.j);


	}
}
