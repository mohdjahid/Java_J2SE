import java.util.*;
public class IdentityHashMapDemo
{
	public static void main(String... args)
	{
		
		//HashMap m=new HashMap(); 
		/*
			In case of HashMap, JVM uses equals() method for 
			comparison which is meant for content comparison.i.e, why
			duplicates keys are not allowed in case of HashMap.
		*/
		IdentityHashMap m=new IdentityHashMap();
		/*
			In case of IdentityHashMap, JVM uses == for
			comparison which is meant for reference comparison.i.e, why
			dupliactes keys can be present in case of IdentityHashMap.
		*/
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
			m.put(i1,"pavan");
			m.put(i2,"kalyan");
		System.out.println(m);
		// {10=kalyan}, in case of HashMap
		// {10=pavan, 10=kalyan}, in case of IdentityHashMap
	}
}