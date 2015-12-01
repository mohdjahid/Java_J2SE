import java.awt.*;
class FrameAdd 
{
	Frame f;
	Button b;
	TextField tf;

	FrameAdd(String s)
	{
		b=new Button("OK");
		f=new Frame(s);
		tf=new TextField();
		
		f.setLayout(null);
		f.setVisible(true);
			
		f.setSize(400,400);
		b.setBounds(100,120,80,30);
		tf.setBounds(100,50,170,20);
		
		f.add(b);
		f.add(tf);
	}
	
	public static void main(String[] args) 
	{
		new FrameAdd("Frame Add");
	}
}
