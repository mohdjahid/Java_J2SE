/*
	Using comparator interface, we can implement custom sorting order
	And Keys can be Heterogenous and duplicates now.
*/
import java.util.*;
public class TreeMapDemo2
{
	public static void main(String... args)
	{
		TreeMap m=new TreeMap(new MyComparator());
		m.put("xxx",10);
		m.put("AAA",20);
		m.put("zzz",30);
		m.put("LLL",10);
		m.put(40,"xxx");

		System.out.println(m);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();

		return s2.compareTo(s1);
	}
}