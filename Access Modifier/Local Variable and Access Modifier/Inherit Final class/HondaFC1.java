class Bike1
{
}

final class HondaFC1 extends Bike1 //Final class can inherited another class
{
	void run()
	{
		System.out.println("running safely with 1000 kmph");
	}

	public static void main(String[] args) 
	{
		HondaFC1 Honda=new HondaFC1();
		Honda.run();
	}
}
