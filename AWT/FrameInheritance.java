import java.awt.*;
class FrameInheritance extends Frame   
{

	FrameInheritance(String s)
	{
		super(s);
		setSize(400,400);
		setVisible(true);
	}			
	public static void main(String[] args) 
	{
		FrameInheritance f=new FrameInheritance("Frame via Inheritance");
	}
}
