import java.util.*;
class ArrayListDemo
{
    public static void main(String... args)
   {
     ArrayList i=new ArrayList(); 
	 i.add("A");
	 i.add(10);
	 i.add("A");
	 i.add(null);
	 System.out.println(i);
	 i.remove(2);
	 System.out.println(i);
	 i.add(2,"m");
	 i.add("N");
	 System.out.println(i);
	 System.out.println(i.contains("A"));
	 System.out.println(i.set(1,"JAHID"));
	 System.out.println(i);
   }

}
