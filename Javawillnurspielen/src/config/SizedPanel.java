package config;
import javax.swing.*;

import util.ShowInFrame;
import java.awt.Dimension;

//Draw mit berechneter größe
public class SizedPanel extends JPanel{
	
	int preferredWidth = 400, preferredHeight=300;
	
	public SizedPanel(int w, int h) {
		preferredWidth=w;
		preferredHeight=h;
		}
	
	public SizedPanel() {}
	
	@Override public Dimension getPreferredSize() {
		return new Dimension(preferredWidth, preferredHeight);
	}
	//Tests
	public static void main (String[] args) {
		ShowInFrame.show(new SizedPanel());
	}
}
