class CallByValue
{
	int data=50;

	void change( int data )
	{
		data=data+100;
		System.out.println("Data in chnage : "+data);
	}

	public static void main( String[] args )
	{
		CallByValue op=new CallByValue();
		System.out.println("Befor change : "+op.data );
		
		op.change(500);

		System.out.println("After chnage "+op.data);
	}
}