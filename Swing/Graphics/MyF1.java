import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyCanvas extends Canvas
{
	
	public void paint(Graphics g)
	{
		g.drawLine(70,70,200,200);
	}
}

class MyF1
{
	MyF1()
	{
		JFrame f=new JFrame("Graphics");
		MyCanvas c=new MyCanvas();
		f.add(c); f.setSize(400,400); f.setVisible(true);

	}
	public static void main(String... args)
	{
		new MyF1();
	}
}
