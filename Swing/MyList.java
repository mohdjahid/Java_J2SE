import javax.swing.*;
import java.awt.*;
class  MyList extends JFrame
{
	List fruitlist;
	MyList()
	{
		super("List");
		String[] fruit={"Mango","Pineapple","Banana","Papaya"};
		fruitlist=new List(fruit.length-1);
		for(int i=0;i<fruit.length;i++)
			fruitlist.add(fruit[i]);
		add(fruitlist); setSize(400,400); setVisible(true);
	}

	public static void main(String[] args) 
	{
		 new MyList();
	}
}
