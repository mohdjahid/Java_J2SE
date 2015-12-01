import javax.swing.*;
import java.awt.*;
class  MyChoice  
{
	JFrame f;
	Choice pizzahouse;
	MyChoice()
	{
		f=new JFrame("Choice");
		pizzahouse=new Choice();
		pizzahouse.add("Large Pan Pizza");
		pizzahouse.add("Medium Pan Pizza");
		pizzahouse.add("Small Pan Pizza");

		f.add(pizzahouse); f.setSize(400,400);   f.setVisible(true);  
	}
	
	public static void main(String[] args) 
	{
		new MyChoice();
	}
}
