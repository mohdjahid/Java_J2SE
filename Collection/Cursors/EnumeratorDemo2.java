/*--------- Iterator is a Universal Cursor ----------
	Can't Preform Replacement Operation
	Single Directional Cursor
*/
import java.util.*;
public class EnumeratorDemo2
{
	public static void main(String... args)
	{
		ArrayList al=new ArrayList();
		for(int i=0;i<10;i++)
		{
			al.add(i);
		}
		Iterator itr=al.iterator();
		System.out.println(al);
		while( itr.hasNext() )
		{
			Integer i=(Integer)itr.next();
			if(i%2==0)
				System.out.println(i);
			else
				itr.remove();
		}	
		System.out.println(al);
	}
}