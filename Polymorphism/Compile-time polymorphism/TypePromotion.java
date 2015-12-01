//float can't be implicitly type cast into long even float=4byte and long=8byte
class TypePromotion
{
    void sum(long b)
    {
      System.out.println("Int arg method invoked");
    }
   
    void sum(int b)
    {
      System.out.println("Long arg method invoked");
    }
   
    public static void main(String... args)
    {
       float b=10.0f;
       TypePromotion obj=new TypePromotion();
       obj.sum(b);
    }
}
