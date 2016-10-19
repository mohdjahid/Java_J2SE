/*
	If we are not satisfied with the comparable interface(natural sorting order)
	Then we can implements comparator interface and implement compare() method.
*/
import java.util.*;
public class TreeSetDemo2
{
	public static void main(String... args)
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	//Descending Order
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return 1;
		else if(i1>i2)
			     return -1;
			 else
					return 0;
	}

	//Ascending Order
	/*public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return -1;
		else if(i1>i2)
			     return 1;
			 else
					return 0;
	}*/

	//Duplicates are Allowed
	/*public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return 1;
		else if(i1>i2)
			     return -1;
			 else
					return 1;
	}*/
}