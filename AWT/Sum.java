import java.awt.*;
import java.awt.event.*;
class  Sum implements ActionListener
{
	Frame f;
	TextField tf,tf1,tf2;
	Button b;

	Sum(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf1=new TextField();
		tf2=new TextField();
		b=new Button("ADD");

		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
        
		b.addActionListener(this);
	//	b.addKeyListener(new KeyEventListener(this));

		f.add(tf);
		f.add(tf1);		
		f.add(b);
		f.add(tf2);

	}

	public static void main(String[] args) 
	{
		new Sum("Sum");
	}

	public void actionPerformed(ActionEvent e)
	{
		String s1=tf.getText();
		String s2=tf1.getText();

		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=n1+n2;
		tf2.setText(String.valueOf(n3));
	}
}
/*class KeyEventListener implements KeyListener
{
	Sum s;
	KeyEventListener(Sum s)
	{
		this.s=s;
	}
	
	public void keyTyped(KeyEvent e)
	{
		String s1=s.tf.getText();
		String s2=s.tf1.getText();

		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=n1+n2;
		s.tf2.setText(String.valueOf(n3));
       
	}
}*/

