/*
	Duplicates are not allowed
	Insertion order is not preserved
*/
import java.util.*;
public class LinkedHashSetDemo
{
	public static void main(String... args)
	{
		LinkedHashSet l=new LinkedHashSet();
		l.add("B");
		l.add("C");
		l.add("Z");
		l.add("D");
		l.add(null);
		l.add(10);
		System.out.println(l.add("B"));
		System.out.println(l);
	}
}