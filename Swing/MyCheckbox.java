import javax.swing.*;
import java.awt.*;
class  MyCheckbox extends JFrame 
{
	CheckboxGroup pizzaGroup;
	Checkbox large,medium,small;
	MyCheckbox()
	{
		JFrame f=new JFrame("Checkbox");
		pizzaGroup=new CheckboxGroup();
		large=new Checkbox("Large Pan Pizza",pizzaGroup,true);
		medium=new Checkbox("Medium Pizza",pizzaGroup,true);
		small=new Checkbox("Small Pan Pizza",pizzaGroup,false);
		f.add(large); f.add(medium); f.add(small);
		f.setLayout(new FlowLayout());
		f.setSize(400,400);   f.setVisible(true);  
	}
	
	public static void main(String[] args) 
	{
		new MyCheckbox();
	}
}
