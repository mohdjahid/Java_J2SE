/*
	TreeSet doesn't allow duplicate
	Contains Homogenous Elements
	If get hetrogenous, Will get Runtime Exception
*/
import java.util.*;
public class TreeSetDemo
{
	public static void main(String... args)
	{
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("z");
		t.add("L");
		//t.add(1);
		System.out.println(t.add("z"));
		System.out.println(t);
	}
}