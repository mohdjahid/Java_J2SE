class CopyConstructor 
{
	int data=10;

	CopyConstructor()
	{
		data=10;
	}

	CopyConstructor(CopyConstructor obj)
	{
		data=obj1.data;
    }
	
	public static void main(String[] args) 
	{
		CopyConstructor obj1= new CopyConstructor();
		CopyConstructor obj2= new CopyConstructor(obj1);
		obj1.data=50;
		System.out.println(obj1.data);
		System.out.println(obj2.data);
	}
}
