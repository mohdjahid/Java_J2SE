// Version 1.6 Enhancement
import java.util.*;
public class NavigableSetDemo
{
	public static void main(String... args)
	{
		TreeSet t=new TreeSet();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		System.out.println(t);

		System.out.println(t.ceiling(2000)); //Just bigger than value or equal
		System.out.println(t.higher(2000));  //Just bigger than value
		System.out.println(t.floor(3000));   //Just smaller than value or equal 
		System.out.println(t.lower(3000));	 //Just smaller than value or equal 

		System.out.println(t.pollFirst());

		System.out.println(t);

		System.out.println(t.descendingSet());
		System.out.println(t);
	}
}