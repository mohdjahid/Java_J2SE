class Overload
{
    void main(int a)
   {
     System.out.println("a-main() method");
   }

    void main(byte a)
   {
    System.out.println("b-main() method");
   }	

    public static void main(String... args)
   {
     Overload obj=new Overload();
     obj.main((byte)10);
   }

}
