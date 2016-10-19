/*
	HashMap and WeakHashMap are the same with one diffrence
	HashMap dominates Garbage Collector, whereas
	Garbage Collector dominates WeakHashMap
*/
import java.util.*;
import java.io.*;

public class WeakHashMapDemo
{
	public static void main(String... args)throws InterruptedException
	{
		WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t,"prolog");

		System.out.println(m);
		t=null;
		System.gc();
		
		Thread.sleep(5000);
		System.out.println(m);
	}
}

class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalize Method Called");
	}
}