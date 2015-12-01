import java.awt.*;
class FrameAssociation
{
	Frame f;
	FrameAssociation(String s)
	{
		f=new Frame(s);
		f.setVisible(true);
		f.setSize(400,400);
	}

	public static void main(String[] args) 
	{
		new FrameAssociation("FrameAssociation");
	}
}
