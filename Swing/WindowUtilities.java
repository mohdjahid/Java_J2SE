import javax.swing.*;
import java.awt.*;

public class WindowUtilities 
{
	public static void setNativeLookAndFeel()
	{
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e){
			System.out.println("Error setting native look and feel"+e);
		}
	}
	public static void setJavaLookAndFeel()
	{
		try{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch (Exception e){
			System.out.println("Error setting java look and feel"+e);
		}
	}
	public static void setMotifLookAndFeel()
	{
		try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		}
		catch (Exception e){
			System.out.println("Error setting Motif look and feel"+e);
		}
	}
}
