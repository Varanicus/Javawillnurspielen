
public class SimpleRect extends GeometricObject{

	public SimpleRect(double w, double h, Vertex pos) {
		super(w,h,pos);
	}
	public SimpleRect(double w, double h, double x, double y) {
		super(w,h, new Vertex(x,y));
	}
	@Override public double area() {
		return width*height;
	}
	public @Override String toString() {
		return "SimpleRect("+super.toString()+")";
	}
	public @Override boolean equals(Object that) {
		return (that instanceof SimpleRect) && super.equals(that);
	}
	

}
