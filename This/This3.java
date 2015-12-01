class This3 
{
	This3 This3()
	{
		System.out.println("It is not a constructor, It is a method of same class name has return type");
		return(this); // Reference of current object is returned using this.
    }
		
	
	public static void main(String[] args) 
	{
		This3 obj=new This3();
		System.out.println("Reference of Object is : "+obj);
		This3 obj1=obj.This3();
		System.out.println("Reference of same object is : "+obj1);
	}
}
