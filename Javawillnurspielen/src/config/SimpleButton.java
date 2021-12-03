package config;
import javax.swing.*;
import util.ShowInFrame;

public class SimpleButton extends JPanel{
	JButton b = new JButton("push this button +");
	JButton c = new JButton("push this button -");
	JButton d = new JButton("push this button 0");
	JLabel l = new JLabel("000");
	SimpleButton(){
		add(b);
		add(c);
		add(d);
		add(l);
	}
	public static void main(String [] args) {
		ShowInFrame.show(new SimpleButton());
	}

}
