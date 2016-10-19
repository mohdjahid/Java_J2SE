/*
	priority are defined on customized sorting order by comparator interface

*/
import java.util.*;
public class PriorityQueueDemo1
{
	public static void main(String... args)
	{
		PriorityQueue q=new PriorityQueue(111,new MyComparator());
		System.out.println(q);

		for(int i=0;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		
		System.out.println(q);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;

		return -i1.compareTo(i2);
	}
}