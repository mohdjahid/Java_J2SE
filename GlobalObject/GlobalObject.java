//Addition of instance variable of two object .

class GlobalObject
{
	int data;
    static GlobalObject obj;

	void change(GlobalObject obj1)
	{
		data=obj1.data+10;
	}

	int change(GlobalObject obj1,int data)
    {
		data=obj1.data+20;
		return data;
	}

    public static void main( String[] args )
	{
		GlobalObject obj1=new GlobalObject();
		obj1.data=5;
		
		obj=new GlobalObject();
		
		obj.change(obj1,0);
		System.out.println(obj.data);
    }

    
}