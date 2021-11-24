package util;
import javax.swing.*;

public class ShowInFrame {
 public static void show (String title , JComponent c) {
	 JFrame f= new JFrame(title);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 f.add(c);
     f.pack();
     f.setVisible(true);
 }
 public static void show ( JComponent c) {
	 show("",c);
 }
 
}
   