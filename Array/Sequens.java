class Sequens 
{
  static int[] a;
  static  void swap(int i,int j)
	{
		int x=a[i];
		a[i]=a[j];
		a[j]=x;
	}
	
  static int splitter(int ar_index,int digit)
	{
	    int i=0,num=a[ar_index];
		
		int[] x=new int[10];
		x[i++]=num%10;
		while(num/10!=0 )		
		{
			x[i++]=num%10;
			num/=10;						
		}
        /*for(int j=0;j<i;j++)
		  System.out.print(" "+a[j]+" ");
		System.out.println();*/
			return x[i-digit];
	}

	public static void main(String[] args) 
	{
		a=new int[] {74,3,9,2,10,54};
		int num,num1;
        for( int i=0,digit=0;i<a.length;i++ )
		{
			for( int j=i+1;j<a.length;j++ )
			{
				num=splitter(i,digit);
				num1=splitter(j,digit);
				if(num<num1)
  					swap(i,j);
				System.out.print(num+" "+num1+" ");
				while(num==num1)
				{
				//	System.out.println(num+" "+num1); 
					num=splitter(i,++digit);
					num1=splitter(j,digit);
					
				    if(num<num1)
  					   swap(i,j);
				}
				digit=0;
			}

		//	for(int j=0;j<a.length;j++)
		//    	System.out.print(a[j]+" ");
		}

/*		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);*/

	}
}
