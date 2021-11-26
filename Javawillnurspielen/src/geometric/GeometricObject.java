package geometric;
import java.awt.Color;

import config.Vertex;

//Fläche im zweideimensionalen Raum
public class GeometricObject {
	//Variablen
	public Vertex pos;
	public double height;
	public double width;
	public Color color;

	//Konstruktoren + Überladen
	public GeometricObject(double width, double height, Vertex pos , Color color) {
		this.pos = pos;
		this.width = width;
		this.height = height;
		this.color= color;

		if (width < 0) {
			width = -width;
			pos.x = pos.x - width;
		}
		if (height < 0) {
			height = -height;
			pos.y = pos.y - height;
		}

	}

	public GeometricObject(double width, double height) {
		this(width, height, new Vertex(0, 0), new Color(0,0,0));
	}

	public GeometricObject(double width) {
		this(width, width);
	}

	public GeometricObject() {
		this(10);
	}
    
	//Textuelle Darstellung
	public String toString() {
		return "width=" + width + ", height=" + height + ", pos=" + pos;
	}
    
	//Umfang
	public double circumference() {
		return 2 * (width + height);
	}

	//Flächeninhalt
	public double area() {
		return width * height;
	}
    
	//Geter
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Vertex getPos() {
		return pos;
	}
	
	//Testet ob Punkt in der figur liegt
	public boolean contains(Vertex v) {
		return v.x >= pos.x && v.x <= pos.x+width 
				&& v.y >= pos.y && v.y <= pos.y+height;
	}
    
	//Größenvergleich
	public boolean isLargerThan(GeometricObject that) {
		return this.area() > that.area();
	}
    
	//verschieben des Eckpunktes absolut
	public void moveTo(Vertex pos) {
		this.pos = pos;
	}
    
	
	public void moveTo(double x, double y) {
		moveTo(new Vertex(x, y));
	}

	//relativ verschieben 
	public void move(Vertex v) {
		moveTo(pos.add(v));
	}

	//Verlgeicht 2 Methoden
	public boolean equals(Object thatObject) {
		if (thatObject instanceof GeometricObject) {
			GeometricObject that = (GeometricObject) thatObject;
			return that.width == this.width 
					&& that.height == this.height 
					&& this.pos.equals(that.pos);
		}
		return false;
       
	}

}
