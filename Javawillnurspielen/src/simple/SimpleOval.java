package simple;
import java.awt.Color;

import config.Vertex;
import geometric.GeometricObject;

//Unterklasse Kreis 
public class SimpleOval extends GeometricObject{

	//Konstructor wird überladen
	public SimpleOval(double w, double h, Vertex pos, Color color) {
		super(w,h,pos, color);
	}
	
	public SimpleOval(double w, double h, double x, double y) {
		super(w,h, new Vertex(x,y),new Color(0,0,0));
	}
	
	//Methoden werden überladen
	@Override public double area() {
		return Math.PI*width*height/4;
	}
	
	@Override public String toString() {
		return "SimpleOval("+super.toString()+")";
	}
	
	@Override public boolean equals(Object that) {
		return (that instanceof SimpleOval) && super.equals(that);
	}
	

}
