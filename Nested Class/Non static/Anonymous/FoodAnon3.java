class Popcorn 
{
	public void pop() 
	{
		System.out.println("popcorn");
	}
	Popcorn(int x)
	{
		System.out.println("Arg-const Popcorn");
	}
	Popcorn(){ System.out.println("No-arg const Popcorn");  }
}

class FoodAnon3
{
	public static void main(String... args)
	{
		Popcorn p=new Popcorn(5) {
			public void pop()
			{
				System.out.println("Anonymous popcorn");
			}
		 
			{
				Popcorn obj=new Popcorn();
				obj.pop();
			}
		};
		p.pop();
	}
}