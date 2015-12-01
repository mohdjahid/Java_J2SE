import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MouseEvents extends JFrame implements MouseListener, MouseMotionListener 
{
	TextField t;
	MouseEvents()
	{
		super("MouseEvents");
		t=new TextField(); t.setBounds(40,50,100,50);
		add(t);
		addMouseListener(this);
		addMouseMotionListener(this);
		setLayout(null);
		setVisible(true); setSize(400,400);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		t.setText("mouseClicked");					// me.getX(); to get value of x axis;						// me.getY(); to get value of y axis;
	}
	
	public void mouseEntered(MouseEvent me)
	{
		t.setText("mouseEntered");					// me.getX(); to get value of x axis;						// me.getY(); to get value of y axis;
	}

	public void mousePressed(MouseEvent me)
	{
		t.setText("mousePressed");					// me.getX(); to get value of x axis;						// me.getY(); to get value of y axis;
	}

	public void mouseReleased(MouseEvent me)
	{
		t.setText("mouseReleased");					// me.getX(); to get value of x axis;						// me.getY(); to get value of y axis;
	}

	public void mouseDragged(MouseEvent me)
	{
		t.setText("mouseDragged");					// me.getX(); to get value of x axis;						// me.getY(); to get value of y axis;
	}

	public void mouseMoved(MouseEvent me)
	{
		t.setText("mouseMoved");					// me.getX(); to get value of x axis;						// me.getY(); to get value of y axis;
	}

	public void mouseExited(MouseEvent me)
	{
		t.setText("mouseExited");					// me.getX(); to get value of x axis;						// me.getY(); to get value of y axis;
	}

	
	public static void main(String[] args) 
	{
		new MouseEvents();
	}
}
