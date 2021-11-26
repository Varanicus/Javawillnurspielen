package paintable;
import java.awt.Color;

import config.Vertex;
import simple.SimpleOval;

//Ein oval was alles kann von SimpleOval und schnittstellen von Paintable
public class PaintableOval extends SimpleOval implements Paintable{
	
		public PaintableOval(double width,double height,double x,double y, Color color) {
			super(width,height,new Vertex(x,y),color);
		}
		public PaintableOval(double width, double height, double x, double y) {
			this(width, height, x, y, new Color(0,0,0));
		}
		public void paintTo(java.awt.Graphics g) {
			g.fillOval ((int)pos.x,(int)pos.y,(int)width,(int)height);
		}
	}


