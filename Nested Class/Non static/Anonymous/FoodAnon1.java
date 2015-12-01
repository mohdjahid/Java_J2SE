interface Popcorn1 
{
	void pop(); 
}

class FoodAnon1
{
	public static void main(String... args)
	{
		Popcorn p=new Popcorn(){
			public void pop()
			{
				System.out.println("Anonymous popcorn");
			}		 
			{
				System.out.println("init");
			}
		};
		p.pop();
	}
}
