package panel;
import config.Paintable;
import objects.PaintableOval;
import objects.PaintableRect;
import util.ShowInFrame;

//Team2 Der Schnittstelle wissen das es irgendwo klassen mit Methoden gibt und erstellen dazu klassen mit objekten
public class PaintablePanel extends SizedPanel {
	
	//Unsere Paintable Objecte in einem Fenster datstellen lassen
	Paintable pa;
	
	//Konstructor
	public PaintablePanel (Paintable pa) {
		this.pa = pa;
	}
	
	//Schreibt sich über die Graphic
	public void paintComponent(java.awt.Graphics g) {
		pa.paintTo(g);
	}
	
	//Tests
	public static void main(String [] args) {
		ShowInFrame.show(new PaintablePanel(new PaintableOval(100,50,30,50)));
		ShowInFrame.show(new PaintablePanel(new PaintableOval(10,10,130,40)));
		ShowInFrame.show(new PaintablePanel(new PaintableRect(20,90,200,80)));
	}

}
