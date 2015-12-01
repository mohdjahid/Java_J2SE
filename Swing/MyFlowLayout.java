import java.awt.*;
import javax.swing.*;
public class MyFlowLayout 
{
	JFrame f;
	JButton b1,b2,b3,b4,b5;
	MyFlowLayout()
	{
		f=new JFrame();
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		f.setLayout( new FlowLayout(FlowLayout.LEFT,10,100) );
		f.setSize(400,300); f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new MyFlowLayout();
	}
}
