//Data Shadowing

class This0
{
	int id;
	String name;

	This0(int id,String name)
    {
		this.id=id;
		this.name=name;
	}

	void display()
    {
		System.out.println(id+" "+name);
    }

	public static void main( String args[] )
    {
		This0 s1=new This0(1,"Rizwan");
		This0 s2=new This0(2,"khan");
		s1.display();
		s2.display();
    }
	
}