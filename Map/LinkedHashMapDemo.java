/*
	Underlined Data structure is HashTable+LinkedList
	Insertion Order is preserved
	Duplicates keys are not allowed
*/
import java.util.*; 
public class LinkedHashMapDemo
{
	public static void main(String... args)
	{
		LinkedHashMap m=new LinkedHashMap();
		m.put("chand",700);
		m.put("veer",1000);
		m.put("basif",800);
		m.put("nahid",500);

		System.out.println(m); //{chand=700, basif=800, veer=1000, nahid=500}
		System.out.println(m.put("chand",750));
		// Since Duplicate Keys are not allowed, It will replace the existing one entry with new , if already exist.
		
		Set s=m.keySet();
		System.out.println(s);//[chand,basif,veer,nahid]

		Collection c=m.values();
		System.out.println(c);//[750,800,1000,500]

		Set s1=m.entrySet();
		Iterator itr=s1.iterator();

		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"---"+m1.getValue());
			if(m1.getKey().equals("nahid"))
			{
				m1.setValue(1000);
			}
		}
		/*
		  chand---750
		  basif---800
		  veer---1000
		  nahid---500
		*/

		System.out.println(m);
		//{chand=750, basif=800, veer=1000, nahid=500}
	}
}