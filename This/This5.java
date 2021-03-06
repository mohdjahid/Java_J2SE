// Function chaining is achieved by using this  
//If you are usig 'this' in constructor chaining then 'this' should be your first statement 
class This5 
{
	float x;
	float y;
	float z;

	This5()
	{
       this(1.2f); //Constructor is invocked
	}

    This5(float x)
	{
       this(x,2.2f,3.2f); //Constructor id invocked
	}

	This5(float x,float y,float z)
	{
		this.x=x; this.y=y; this.z=z;
	}

	void display()
	{
         System.out.println(x+" "+" "+y+" "+z);
	}

	public static void main(String[] args) 
	{
        This5 obj=new This5();
		obj.display();		
	}
}
