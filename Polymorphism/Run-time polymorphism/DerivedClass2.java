abstract class BaseClass2
{
   abstract void methodToOverride();
}

class DerivedClass2 extends BaseClass2
{
   void methodToOverride()
   {
     System.out.println("Aaj Toofan Dekhte hain");
   }
  
   public static void main(String... args)
  {
    DerivedClass2 obj2=new DerivedClass2();
    obj2.methodToOverride();
  }
}
  