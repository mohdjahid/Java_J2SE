// USING CheckBox
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class OSSelect implements ItemListener
{
	JFrame f;
	TextArea l;
	CheckboxGroup cbg;
	Checkbox win,mac,unix;
	String msg;
	
	OSSelect()
	{
		f=new JFrame("Graphics");
		l=new TextArea(); 
		cbg=new CheckboxGroup();
		win=new Checkbox("win",cbg,true); 
		mac=new Checkbox("mac",cbg,false);
		unix=new Checkbox("unix",cbg,false);

		f.add(win); f.add(mac); f.add(unix); f.add(l);
		win.addItemListener(this); mac.addItemListener(this); unix.addItemListener(this); 
		
		f.setSize(400,400); f.setVisible(true); f.setLayout(new FlowLayout());
	}

	public static void main(String... args)
	{
		new OSSelect();
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		msg="currnet selection ";
		msg+=cbg.getSelectedCheckbox().getLabel();
		l.setText(msg);
	}

}