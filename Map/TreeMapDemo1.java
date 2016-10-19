/*
	Underlined Data Structure is Red-Black Tree
	Duplicated Keys are not allowed
	Null Key is not allowed
	Only Homogenous Keys are allowed
	Default Natural Sorting Order because of comparable interface
*/
import java.util.*;
public class TreeMapDemo1
{
	public static void main(String... args)
	{
		TreeMap m=new TreeMap();
		m.put(100,"zzz");
		m.put(103,"yyy");
		m.put(101,"xxx");
		m.put(104,106);
		m.put(107,null);
		//m.put("fff","xxx"); //ClassCast Exception
		//m.put(null,"zzz");  //Null Pointer Exception
		System.out.println(m);
	}
}