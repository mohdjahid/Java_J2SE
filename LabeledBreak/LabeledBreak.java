class LabeledBreak
{
  public static void main(String[] args)
     {
       boolean isTrue=true;
	   outer:
           for( int i=0; i<5 ;i++ )
		   {
		        while( isTrue==true )
				{
				 System.out.println("Hello");
				 continue outer;
				 }
		   
		   System.out.println("Outer-Loop");
		   }
		   System.out.println("Good-Bye");
	  }
}	  