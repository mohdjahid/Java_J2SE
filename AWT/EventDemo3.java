import java.awt.*;
import java.awt.event.*;
class  EventDemo3
{
	Frame f;
	TextField tf;
	EventDemo3(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(60,50,170,20);

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

		f.add(tf);
		tf.addKeyListener(new KeyEventListener());

		f.addWindowListener(new WindowEventListener());

		f.addMouseListener(new MouseEventListener(this));
	
	}

	public static void main(String[] args) 
	{
		new EventDemo3("EventDemo3");
	}
}

class KeyEventListener extends KeyAdapter
{
     public void keyTyped(KeyEvent e)
	{
		  System.out.println(e.getKeyChar() );
	}
}

class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

class MouseEventListener extends MouseAdapter
{
	EventDemo3 t;
	MouseEventListener(EventDemo3 t)
	{
		this.t=t;
	}

	public void mouseClicked(MouseEvent e)
	{
		t.f.setBackground(Color.RED);
		t.tf.setText("Mouse Event");
	}	
}