class BaseClass1
{
   static public void methodToOverride()
    {
      System.out.println("I'm the method of Base Class");
    }
}

class Derivedclass1 extends BaseClass1
{
  static public void methodToOverride()
   {
     System.out.println("I'm the method of Derived Class");
   }

  static void display()
  {
    System.out.println("Display");
  }	

   
  public static void main(String... args)
  {
     BaseClass1 obj1=new Derivedclass1();
     obj1.methodToOverride();
     obj1.display();
  }
}