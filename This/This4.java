class This4 
{
	int data=5;

	This4()
	{
		System.out.println("Constructors is invocked");
		method(this); // Referenece of current object is passed as an argument in construcor using this
	}

	void method( This4 obj )
	{
        System.out.println("DATA : "+obj.data);
	}
	public static void main(String[] args) 
	{
		new This4();
	}
}
