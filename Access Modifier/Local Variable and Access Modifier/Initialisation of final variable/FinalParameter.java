class FinalParameter 
{
	void cube(final int n)
	{
		n=n+2;    //Error!!!!!!!!!!!!!!!!!!!!
		System.out.println(n*n*n);
	}

	public static void main(String[] args) 
	{
		FinalParameter b=new FinalParameter();
		b.cube(5);
	}
}
