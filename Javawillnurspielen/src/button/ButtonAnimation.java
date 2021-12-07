package button;
import javax.swing.*;

import image.MovableImage;
import panel.MovablePanel;

import java.awt.event.*;
import util.ShowInFrame;

public class ButtonAnimation extends JPanel{
	JButton b = new JButton("push to move");
	MovablePanel mp = new MovablePanel();

	ButtonAnimation(){
		add(mp);
		add(b);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mp.doOnTick();
			}
	   });
	}
	

	
	
	public static void main(String[] args) {
		ButtonAnimation p = new ButtonAnimation();
		p.mp.gos.add(new MovableImage("images/hexe.png",0,0,1,1));
		p.mp.gos.add(new MovableImage("images/biene.png",200,200,-1,-1));
		ShowInFrame.show(p);
		}

}
