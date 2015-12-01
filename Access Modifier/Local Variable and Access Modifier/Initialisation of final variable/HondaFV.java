class HondaFV 
{
	final int speedlimit=90; //final varibale
	void run()
	{
		speedlimit=400;   // Error You can't change value of final variable
	}
	
	public static void main(String[] args) 
	{
		HondaFV obj=new HondaFV();
		obj.run();
	}
}
