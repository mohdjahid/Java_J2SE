import javax.swing.*;
public class Swing1 
{
	JFrame f;
	JButton b;
	Swing1(){
		      f=new JFrame();
			  b=new JButton("Clic");
			  b.setBounds(130,100,100,400);
			  f.add(b);
			  f.setTitle("Swing via Association");
			  f.setSize(400,500);
			  f.setLayout(null);
			  f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Swing1();
	}
}
