class String1 
{
	String s;
	String1(String s)
	{
		this.s=s;
	}

	public String smallString()
	{
       char[] ch=s.toCharArray();
	   for(int i=s.length()-1; i>0 ; i-- )
		   for(int j=0;(j+i)<s.length();j++)
		       if(checkDuplicate(j,j+i+1)==false)
	             return new String(ch,j,i+1);
       return new String(ch,0,1);
    }

	public boolean checkDuplicate(int low,int max)
	{
		int small=smallest(low,max);
		int large=largest(low,max);
		int[] arr=new int[large+1];
		for(int i=low;i<max;i++)
			arr[s.charAt(i)-65]++;
		for(int i=0;i<=large;i++)
			if(arr[i]>1)
			    return true;
		System.out.println(arr[0]);
		return false;
	}

	public int smallest(int low,int max)
	{
		System.out.println("low: "+low);
		int num=s.charAt(low);
		for(int i=low+1;i<max;i++)
			if(num>s.charAt(i))
			   num=s.charAt(i);
		return num-65;
	}

	public int largest(int low,int max)
	{
		System.out.println("MAX: "+max);
		int num=s.charAt(low);
		for(int i=low+1;i<max;i++)
			if(num<s.charAt(i))
			   num=s.charAt(i);
		return num-65;
	}
}

public class TestString1
{
	public static void main(String... args)
	{
         String1 s=new String1(args[0]);
		 String small=s.smallString();
		 System.out.println(small);
	}
}