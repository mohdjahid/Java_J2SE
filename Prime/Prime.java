class Prime 
{
	public static void main(String[] args) 
	{
		int i=2;
		long num;
		num=89859787;
		for( ; i*i<=num; i++ ) 
		{
			if( num%i==0 )
			{
				System.out.println("Number is non Prime "+i);
				System.exit(0);
			}
		}

			System.out.println("Number is Prime "+i);
	}
}
/*
  N is prime 
    if( x2 > = N)
	  if( N%x2 == 0 )
	     S.o.p(Prime)
      else
	     S.o.p(Non-Prime);
*/