import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class Game extends JFrame implements ActionListener
{
	boolean TURN;                             // false:ComputerTurn true:UserTurn
	int comp[]=new int[9],user[]=new int[9],c,u,LEVEL=0,score=0;// c and u for indexing
	
	final Button[] bcom=new Button[9];
	final Button[] buser=new Button[9];
	JButton start;
	JDesktopPane jp,jp1,jp2;
	JTextField t;
	JRadioButton rb1,rb2,rb3;

	public Game()
	{
		super("Game");
		jp=new JDesktopPane(); jp1=new JDesktopPane(); jp2=new JDesktopPane(); 
		jp.setLayout(new GridLayout(3,3,10,10)); jp1.setLayout(new GridLayout(3,3,10,10));

		start=new JButton(new ImageIcon("start.png")); start.setBounds(10,10,150,40); start.addActionListener(this); 
		t=new JTextField("0");
		t.setBounds(80,100,80,30); 

		rb1=new JRadioButton("Beginner"); rb2=new JRadioButton("Itermediate"); rb3=new JRadioButton("Expert");
		rb1.setBounds(10,70,80,30); rb2.setBounds(100,70,80,30); rb3.setBounds(200,70,80,30);

		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1); bg.add(rb2); bg.add(rb3);
		
		for(int i=0;i<9;i++)
		{
			bcom[i]=new Button("Button"+(i+1));
			bcom[i].setBackground(Color.LIGHT_GRAY);
			jp.add(bcom[i]); 
		}
		for(int i=0;i<9;i++)
		{
			buser[i]=new Button("Button"+(i+1));
			buser[i].setBackground(Color.LIGHT_GRAY);
			buser[i].addActionListener(this);
			jp1.add(buser[i]);
		}
        
		jp2.add(start); jp2.add(t); jp2.add(rb1); jp2.add(rb2); jp2.add(rb3);
		jp2.setBackground(Color.GREEN);
		
		add(jp,BorderLayout.WEST); add(jp1,BorderLayout.EAST); add(jp2,BorderLayout.CENTER);
						
		setSize(800,480);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==start)
		{
			if(rb1.isSelected())
				LEVEL=4;
		    	else if(rb2.isSelected())
			        	 LEVEL=5;
			        else if(rb3.isSelected())
					     LEVEL=8;
				        else 
					        JOptionPane.showMessageDialog(this,"Please select a difficulty LEVEL");
			computerTurn();
		}

		else 
		{
		  if(TURN==true)
		  if(u<c)
	   	  {
            TURN=true;
			if( e.getSource()==buser[0] )
			  {
				user[u++]=0;
				buser[0].setBackground(Color.RED);
				try{Thread.sleep(700);} catch(Exception ecep){ System.out.println("Exception");}
				buser[0].setBackground(Color.LIGHT_GRAY);
			  }
			else if( e.getSource()==buser[1] )
				{
					user[u++]=1;
					buser[1].setBackground(Color.RED);
					try{Thread.sleep(700);} catch(Exception ecep){ System.out.println("Exception");}
					buser[1].setBackground(Color.LIGHT_GRAY);
				}
			     else if( e.getSource()==buser[2] )
						{ 
							user[u++]=2;
							buser[2].setBackground(Color.RED);
							try{Thread.sleep(700);} catch(Exception ecep){ System.out.println("Exception");}
							buser[2].setBackground(Color.LIGHT_GRAY);
						}
				      else if( e.getSource()==buser[3] )
							{      
								user[u++]=3;
								buser[3].setBackground(Color.RED);
								try{Thread.sleep(700);} catch(Exception ecep){ System.out.println("Exception");}
								buser[3].setBackground(Color.LIGHT_GRAY);
							}
					       else if( e.getSource()==buser[4] )
								{    
									user[u++]=4;
									buser[4].setBackground(Color.RED);
									try{Thread.sleep(700);} catch(Exception ecep){ System.out.println("Exception");}
									buser[4].setBackground(Color.LIGHT_GRAY);
								}
						        else if( e.getSource()==buser[5] )
									{	    
										user[u++]=5;
										buser[5].setBackground(Color.RED);
										try{Thread.sleep(700);} catch(Exception ecep){ System.out.println("Exception");}
										buser[5].setBackground(Color.LIGHT_GRAY);
									}
								     else if( e.getSource()==buser[6] )
										{   
											user[u++]=6;
											buser[6].setBackground(Color.RED);
											try{Thread.sleep(700);} catch(Exception ecep){ System.out.println("Exception");}
											buser[6].setBackground(Color.LIGHT_GRAY);
										}
									      else if( e.getSource()==buser[7] )
												{    
													 user[u++]=7;
													 buser[7].setBackground(Color.RED);
													 try{Thread.sleep(700);} catch(Exception ecep){ System.out.println("Exception");}
													 buser[7].setBackground(Color.LIGHT_GRAY);
												}
										       else if( e.getSource()==buser[8] )
													{  
														user[u++]=8;
														buser[8].setBackground(Color.RED);
														try{Thread.sleep(700);} catch(Exception ecep){ System.out.println("Exception");}
														buser[8].setBackground(Color.LIGHT_GRAY);
													}
		  }
		  
		  if(u==c)
			{
               System.out.println("u :"+u+" c :"+c);
			   comapre();
			   TURN=false;
			   u=c=0;
			   computerTurn();
			}
		}
	}

	public void computerTurn()
	{
		Random r=new Random();
		int random,no_of_button=r.nextInt(LEVEL);
		no_of_button++;
		for(int i=0;i<no_of_button;i++)
		{
			random=r.nextInt(9);
			bcom[random].setBackground(Color.RED);		
		    try{Thread.sleep(700);} catch(Exception e){ System.out.println("Exception");}
		    bcom[random].setBackground(Color.LIGHT_GRAY);
			try{Thread.sleep(700);} catch(Exception e){ System.out.println("Exception");}
			comp[i]=random;
		}
		c=no_of_button;		
		TURN=true;
    }

	public void comapre()
	{
             for(int i=0;i<c;i++)
				 if(comp[i]!=user[i])
				   System.out.println("Game Over");
			 score+=10;
			 t.setText(String.valueOf(score));
	}

	public static void main(String[] args) 
	{
		new Game();
	}

}
