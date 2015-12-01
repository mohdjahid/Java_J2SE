import java.awt.*;
import java.awt.event.*;
class EventDemo implements ActionListener 
{
	Frame f;
	TextField tf;
	Button b1,b2;

	EventDemo(String s)
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

		b1.addActionListener(this);
		b2.addActionListener(this);

		f.add(tf);
		f.add(b1);
		f.add(b2);
	}

	public void actionPerformed(ActionEvent e)
	{
		if( e.getSource()==b1)
			tf.setText("Ok");
		if( e.getSource()==b2)
			tf.setText("Cancel");
		//new EventDemo("EventDemo");
	}
	
	public static void main(String[] args) 
	{
		new EventDemo("EventDemo");
	}
}
