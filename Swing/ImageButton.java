import javax.swing.*;
import java.awt.event.*;
public class ImageButton
{
	JFrame f;
	JButton b;
	ImageButton()
	{
		f=new JFrame();
		b=new JButton(new ImageIcon("laptop.jpg"));
		b.setBounds(130,100,100,40);
		f.add(b);
		f.setSize(300,400); f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String... args)
	{
		new ImageButton();
	}
}
