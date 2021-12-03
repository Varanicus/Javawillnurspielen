package objects;
import java.awt.Color;

import config.Paintable;
import config.Vertex;

//Ein oval was alles kann von SimpleOval und schnittstellen von Paintable
public class PaintableRect extends SimpleRect implements Paintable{
	
		public PaintableRect(double width,double height,double x,double y,Color color) {
			super(width,height,new Vertex(x,y),color);
		}
		public PaintableRect(double width, double height, double x, double y) {
			this(width, height, x, y, new Color(0,0,0));
		}
		public void paintTo(java.awt.Graphics g) {
			g.fillOval ((int)pos.x,(int)pos.y,(int)width,(int)height);
		}
	}

