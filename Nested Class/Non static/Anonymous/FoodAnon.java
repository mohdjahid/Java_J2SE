class Popcorn 
{
	public void pop() 
	{
		System.out.println("popcorn");
	}
}

class FoodAnon
{
	public static void main(String... args)
	{
		Popcorn p=new Popcorn() {
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
