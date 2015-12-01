import java.awt.*;
import java.awt.event.*;
class EventDemo1 
{
	Frame f;
	Button b1,b2;
	TextField tf;
	
	EventDemo1(String s)
	{
		f=new Frame();
		tf=new TextField();
		b1=new Button("Ok");
		b2=new Button("Cancel");

		f.setLayout(null);
		f.setVisible(true);

		f.setSize(400,400);
		tf.setBounds(60,50,170,20);
		b1.setBounds(100,120,80,30);
		b2.setBounds(100,160,80,30);

        Outer o=new Outer(this);
		
		b1.addActionListener(o);
		b2.addActionListener(o);

		f.add(tf);
		f.add(b1);
		f.add(b2);
	}
	
	public static void main(String[] args) 
	{
		new EventDemo1("EventDemo1");
	}
}
