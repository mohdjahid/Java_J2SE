class Parent1
{
   static Parent1 method()
   {
     System.out.println("I'm of Parent");
     return new Child1();
   }
}

class Child1 extends Parent1
{
   static Child1 method()
   {
     System.out.println("I'm of Child");
     return new Child1();
   }

   public static void main(String... args)
   {
     Parent1 obj=new Child1();
     Child1 obj1=(Child1)obj.method();
     System.out.println(obj1);
   }
}     
