// USING CheckBox
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class OSSelect1 implements ItemListener
{
	JFrame f;
	TextArea l;
	Choice os;
	String msg;
	
	OSSelect1()
	{
		f=new JFrame("Graphics");
		l=new TextArea(); 
		os=new Choice(); 
		os.add("mac"); os.add("unix"); os.add("win");

		f.add(os); f.add(l);
		os.addItemListener(this); 
		
		f.setSize(400,400); f.setVisible(true); f.setLayout(new FlowLayout());
	}

	public static void main(String... args)
	{
		new OSSelect1();
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		msg="currnet selection ";
		msg+=os.getSelectedItem();
		l.setText(msg);
	}

}