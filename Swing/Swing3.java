import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing3 implements ActionListener 
{
	JFrame f;
	JButton b;
	Button b1;
	JTextField tf;
	Swing3(String s){
		              f=new JFrame(s);
					  b=new JButton("Swing");
					  tf=new JTextField();
					  b1=new Button("AWT");
					  b.setBounds(40,40,100,100);
					  b1.setBounds(40,150,100,100);
					  tf.setBounds(150,40,100,100);
					  Container c=f.getContentPane();
					  c.add(tf); c.add(b); c.add(b1);
					  b.addActionListener(this); b1.addActionListener(this);
					  c.setLayout(null);
					  f.setSize(400,500);
					  f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			tf.setText("Swing");
		if(e.getSource()==b1)
			tf.setText("AWT");
	}
	public static void main(String[] args) 
	{
		new Swing3("Swing with Content Pane");
	}
}
