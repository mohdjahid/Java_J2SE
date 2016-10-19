/*
	Heterogenous object for both key and Value.
	Insertion Order is not preserved bcz it is based on hashcode.
	Duplicates keys are not allowed.
	Null Value is not allowed for both Key and Value
*/
import java.util.*;
public class HashtableDemo
{
	public static void main(String... args)
	{
		Hashtable h=new Hashtable();
		h.put(new Temp(5),"A");
		h.put(new Temp(2),"A");
		h.put(new Temp(6),"A");
		h.put(new Temp(10),"A");
		h.put(new Temp(23),"A");
		h.put(new Temp(16),"A");
		h.put("prolog","A");
		h.put("prolog",null); //Null Pointer Exception

		System.out.println(h);
	}
}

class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return i+"";
	}
}