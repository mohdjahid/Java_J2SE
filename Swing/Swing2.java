import javax.swing.*;
public class Swing2 extends JFrame 
{
	JButton b;
	Swing2(){
		      super("Swing2");
			  b=new JButton("Click");
			  b.setBounds(130,100,100,40);
			  add(b);
			  setSize(400,500);
			  setLayout(null);
			  setVisible(true);	          
	}

	public static void main(String[] args) 
	{
		new Swing2();
	}
}
