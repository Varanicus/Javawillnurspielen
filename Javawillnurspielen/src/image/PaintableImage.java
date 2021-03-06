package image;
import javax.swing.JPanel;

import config.Paintable;
import panel.PaintablePanel;
import util.ShowInFrame;


//Zeichnen von bildern in Paintable
public class PaintableImage extends JPanel implements Paintable{
	
	MyImage mi;
	
	public PaintableImage(MyImage mi) {
		this.mi=mi;
	}
	public PaintableImage(String name) {
		this.mi=new MyImage(name);
	}
	public void paintTo(java.awt.Graphics g) {
		g.drawImage(mi.get(),0,0,this);
	}
	//Tests
	public static void main(String [] args) {
		PaintableImage pi = new PaintableImage("images/biene.png");
		System.out.println(pi.mi.get().getHeight(pi));
		ShowInFrame.show(new PaintablePanel(pi));
	}
	

}
