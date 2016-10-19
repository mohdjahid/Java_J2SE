/*
	priority are defined on default sorting order
*/
import java.util.*;
public class PriorityQueueDemo
{
	public static void main(String... args)
	{
		PriorityQueue q=new PriorityQueue();
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