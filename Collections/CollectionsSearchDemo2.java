import java.util.*;
class CollectionsSearchDemo2
{
	public static void main(String... args)
	{
		ArrayList l=new ArrayList();
		MyComparator c=new MyComparator();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		
		System.out.println(l);
		Collections.sort(l,c);

		System.out.println(l);

		System.out.println(Collections.binarySearch(l,"Z",c));
		System.out.println(Collections.binarySearch(l,"j",c));
	}
}

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
}