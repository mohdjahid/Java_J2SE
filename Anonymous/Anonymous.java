class Anonymous
{
	Anonymous change()
	{
	   System.out.println("Hello");
	   return this;
	}

	Anonymous()
    {
	   System.out.println("World");
    }

	void show()
    {
		System.out.println("Show");
	}

	public static void main(String []args)
	{
		new Anonymous().change().show();
	}

}