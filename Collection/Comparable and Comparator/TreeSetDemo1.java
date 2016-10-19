/*
	TreeSet has Natural Sorting Order because
	It's implements comparable interface which provide natural sorting order
	If we 
*/
import java.util.*;
public class TreeSetDemo1
{
	public static void main(String... args)
	{
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(0);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}