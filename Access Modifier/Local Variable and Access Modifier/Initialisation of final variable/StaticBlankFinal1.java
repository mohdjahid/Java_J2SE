class SBF1 // Static Blank Final 
{
	final static int x;//=10;
	static
	{
		System.out.println(x);   // Error static member is not initialsed by compiler as in case of instance 
		                         // variable
	}	
	
}
