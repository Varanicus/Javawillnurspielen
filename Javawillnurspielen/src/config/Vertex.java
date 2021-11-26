package config;

//Punkte im zweideimensionalen Raum
public class Vertex {
	//Variablen
	public double x;
	public double y;

	//Konstruktor
	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}
    
	//Textuelle Darstellung
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
    
	//Betrag zu (0,0)
	public double length() {
		return Math.sqrt(x * x + y * y);
	}
    
	//Erzeugung neuer Vertexe
	public Vertex skalarMult(double s) {
		return new Vertex(x * s, y * s);
	}
    
	//Verändert den Vertex
	public void skalarMultMod(double s) {
		x = s * x;
		y = s * y;
	}
    //Rechnet Vertex 2 auf 1 drauf und erstellt neues
	public Vertex add(Vertex v2) {
		return new Vertex(x + v2.x, y + v2.y);
	}
    
	//Zieht Vertex 2 von 1 ab
	public Vertex sub(Vertex v2) {
		return new Vertex(x - v2.x, y - v2.y);
	}
    
	//Rechnet Vertex 2 auf 1 aber verändert Vertex 1
	public void addMod(Vertex v2) {
		x = x + v2.x;
		y = y + v2.y;
	}

	//Seter und Geter
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
    //Vergleicht ob 2 Punkte aufeinander liegen
	public boolean equals(Object thatObject) {
		if (thatObject instanceof Vertex) {
			Vertex that = (Vertex) thatObject;
			return this.x == that.x && this.y == that.y;

		}
		return false;

	}

	//Berechnet den abstand zwischen zwei punkten
	public double distance(Vertex v2) {
		double xx = v2.x - this.x;
		double yy = v2.y - this.y;

		return Math.sqrt(xx * xx + yy * yy);
	}

	public void normalize() {
		double factor = this.length();
		x = x / factor;
		y = y / factor;

	}

}
