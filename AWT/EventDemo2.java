import java.awt.*;
import java.awt.event.*;
class EventDemo2 
{
	Frame f;
	TextField tf;
	Button b1;

	EventDemo2(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		b1=new Button("Ok");

		f.setLayout(null);
		f.setVisible(true);

		f.setSize(400,400);
		tf.setBounds(60,50,170,20);
        b1.setBounds(100,120,80,30);

        b1.addActionListener( 
			new ActionListener() { 
			public void actionPerformed(ActionEvent e)
		 {
			tf.setText("Inner Listener");
		 }
		}
		);

		f.add(tf);
		f.add(b1);
	}
	
	public static void main(String[] args) 
	{
		new EventDemo2("EventDemo2");
	}
}