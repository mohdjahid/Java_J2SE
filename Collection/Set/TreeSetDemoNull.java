/*
	TreeSet
	Only Upto jdk 1.6 first insertion can be null, after that no element can't be inserted.
*/
import java.util.*;
public class TreeSetDemoNull
{
	public static void main(String... args)
	{
		TreeSet t=new TreeSet();
		t.add(null);
		System.out.println(t);
	}
}