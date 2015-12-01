import java.awt.*;
import java.awt.event.*;
class Outer implements ActionListener 
{
	EventDemo1 f;
	Outer(EventDemo1 f)
	{
		this.f=f;
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==f.b1)
			f.tf.setText("Ok");
		if(e.getSource()==f.b2)
		    f.tf.setText("Cancel");
	}
}
