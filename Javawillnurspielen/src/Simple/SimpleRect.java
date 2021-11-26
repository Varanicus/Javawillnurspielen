package Simple;
import java.awt.Color;

import config.Vertex;
import geometric.GeometricObject;

public class SimpleRect extends GeometricObject{

	public SimpleRect(double w, double h, Vertex pos, Color color) {
		super(w,h,pos,color);
	}
	public SimpleRect(double w, double h, double x, double y) {
		super(w,h, new Vertex(x,y), new Color(0,0,0));
	}
	@Override public double area() {
		return width*height;
	}
	@Override public String toString() {
		return "SimpleRect("+super.toString()+")";
	}
	@Override public boolean equals(Object that) {
		return (that instanceof SimpleRect) && super.equals(that);
	}
	

}
