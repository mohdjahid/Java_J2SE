import java.util.*;
class LinkedListDemo
{
	public static void main(String... args)
	{
		LinkedList l1=new LinkedList();
		l1.add("prolog");
		l1.add(23);
		l1.add(null);
		l1.add("prolog");
		l1.set(0,"Academy");
		l1.add(0,"Lucky");
		l1.add("Ruman");
		System.out.println(l1);
	}
}