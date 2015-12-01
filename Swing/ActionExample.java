import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class ActionExample extends JFrame implements ActionListener
{
	JButton OkButton,WrongButton;
	TextField nameField;
	CheckboxGroup radioGroup;
	Checkbox radio1,radio2,radio3;
	Canvas c;
	
	

	ActionExample()
	{
		super("Action Example");
		c=new Canvas();
		OkButton=new JButton("Ok");
		WrongButton=new JButton("Reject");
		nameField=new TextField("Type here");
		radioGroup=new CheckboxGroup();
		radio1=new Checkbox("Red",radioGroup,false);
		radio2=new Checkbox("Blue",radioGroup,true);
		radio3=new Checkbox("Green",radioGroup,false);

		add(c);
		add(OkButton); add(WrongButton); add(nameField);
		add(radio1); add(radio2); add(radio3);

		OkButton.addActionListener(this);
		WrongButton.addActionListener(this);

		setSize(400,400); setVisible(true); setLayout(new FlowLayout());
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==OkButton)
		{
			nameField.setText("OkButton");
			
		}

		if(e.getSource()==WrongButton)
		{
			nameField.setText("WrongButton");
		}

		if(radio1.getState())
		{
			nameField.setBackground(Color.red);
		}

		if(radio2.getState())
		{
			nameField.setBackground(Color.blue);
		}

		if(radio3.getState())
		{
			nameField.setBackground(Color.green);
		}
	}

	public static void main(String... args)
	{
		new ActionExample();
	}

}