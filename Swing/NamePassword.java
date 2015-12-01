import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class NamePassword extends JFrame implements ActionListener
{
	TextField tf1,tf2;
	JLabel l1,l2;
	String name,selectname,password;
	TextArea ta;
	
	NamePassword()
	{
		l1=new JLabel("Name");
		l2=new JLabel("Password");
		tf1=new TextField("Type your name");
		tf2=new TextField("Type Password");
		ta=new TextArea();
		add(l1); add(tf1); add(l2); add(tf2);
		tf2.setEchoCharacter('*');
		tf2.addActionListener(this);

		setSize(400,400); setVisible(true); setLayout(new FlowLayout());
	}

	public static void main(String[] args) 
	{
		new NamePassword();
	}

	public void actionPerformed(ActionEvent e)
	{

	}
}
