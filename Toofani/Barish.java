class Toofan
{
	static void method()
	{
		System.out.println("Toofan is coming");
	}
}

class Barish extends Toofan
{
	static void method()
	{
		System.out.println("Barish ho rhi hain");
	}
	
	public static void main(String... args)
	{
		Toofan Barish=new Barish();
		Barish.method();
	}

}