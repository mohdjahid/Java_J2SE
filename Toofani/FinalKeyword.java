class FinalKeyword 
{
	final Integer i=10;//new Integer(10);
	final Integer j=10;//new Integer(10);

	public static void main(String[] args) 
	{
		FinalKeyword obj=new FinalKeyword();
		if(obj.i==obj.j)
		{ 
			System.out.println("Same reference");
		}
	}
}
