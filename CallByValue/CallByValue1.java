class CallByValue1
{
   int data=50;

   void change( CallByValue1 op1 )
    {
      data=data+100;
    }

   public static void main( String[] args )
    {
       CallByValue1 op=new CallByValue1();

       System.out.println("Before change : "+op.data);
	   System.out.println(op);

	   op.change(op);

	   System.out.println("after change : "+op.data);
	}
}


