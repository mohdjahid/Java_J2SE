import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyCanvas2 extends Canvas
{
	String msg;
	public void paint(Graphics g)
	{
		msg+=" inside paint() ";
		g.drawString(msg,50,50);
	}
}

class MyF3
{
	
	MyF3()
	{
		JFrame f=new JFrame("Graphics");
		MyCanvas2 c=new MyCanvas2(); 
		c.msg="Inside MyF3()";
		c.setBackground(Color.cyan);
		c.setForeground(Color.red);
		f.add(c); f.setSize(400,400); f.setVisible(true);

	}
	public static void main(String... args)
	{
		new MyF3();
	}
}
