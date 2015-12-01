final class Bike1
{
}

class HondaFC extends Bike1 //Final class can't be inherited
{
	void run()
	{
		System.out.pritnln("running safely with 1000 kmph");
	}

	public static void main(String[] args) 
	{
		HondaFC Honda=new HondaFC();
		Honda.run();
	}
}
