package button;
import javax.swing.*;

import image.MovableImage;

import java.awt.event.*;
import util.*;
import panel.*;

public class SimpleAnimation extends MovablePanel{
	
	Timer t = new Timer(30,new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			doOnTick();}
		});
	public SimpleAnimation(){
		t.start();
	}
	

	
	public static void main(String[] args) {
		MovablePanel p = new SimpleAnimation();
		p.gos.add(new MovableImage("images/hexe.png",0,0,1,1));
		p.gos.add(new MovableImage("images/biene.png",200,200,-1,-1));
		ShowInFrame.show(p);
		}

}
