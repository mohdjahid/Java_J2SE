/*
	Most Powerful Cursor
	Only applicable for List implemented class Objects
	Not a Universal Cursor
*/
import java.util.*;
public class ListIteratorDemo
{
	public static void main(String... args)
	{
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		ListIterator itr=l.listIterator();

		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("C"))
				itr.remove();
			else if(s.equals("D"))
					itr.add("E");
				else if(s.equals("A"))
					itr.set("Eat");
		}
		System.out.println(l);
	}
}