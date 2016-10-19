/* 
   Insertion Order not Preserved , Values are arranged on the basis of hash code.
   Duplicate not allowed, if duplicate is inserted add() method simply return false w/o adding the element
*/
import java.util.*;
public class HashSetDemo
{
	public static void main(String... args)
	{
		HashSet h=new HashSet();
		h.add("B");
		h.add("Z");
		h.add("C");
		h.add("D");
		h.add(null);
		h.add(10);

		System.out.println(h.add("Z"));
		System.out.println(h);
	}
}