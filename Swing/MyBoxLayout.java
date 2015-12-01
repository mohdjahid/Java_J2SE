import java.awt.*;
import javax.swing.*;
class  MyBoxLayout extends Frame
{
	Button button[];
	MyBoxLayout()
	{
		button=new Button[5];
		for(int i=0;i<5;i++)
		{
			button[i]=new Button("Button"+(i+1));
			add(button[i]);
		}
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new MyBoxLayout();
	}
}
