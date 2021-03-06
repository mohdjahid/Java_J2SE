import java.io.*;

class Dog implements Serializable
{
	int i=10;
}

class Cat implements Serializable
{
	int i=20;
}

class Rat implements Serializable
{
	int i=30;
}


class  SerializeDemo1
{
	public static void main(String[] args) throws Exception
	{
		Dog d1=null,d=new Dog();
		Cat c1=null,c=new Cat();
		Rat r1=null,r=new Rat();
		FileOutputStream fos=new FileOutputStream("pqr.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);

		FileInputStream fis=new FileInputStream("pqr.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);

		
		for(int i=0;i<3;i++)
		{
			Object obj=ois.readObject();
			if( obj instanceof Dog)
						d1=(Dog)obj;
				else if( obj instanceof Cat)
								c1=(Cat)obj;
					  else if( obj instanceof Rat)
									  r1=(Rat)obj;
				  
		}

		System.out.println(d1.i+"----"+c1.i+"---"+r1.i);

		System.out.println(d1+"----"+c1+"---"+r1);

	}
}
