package config;

//Schnittstelle ohne wissen �ber Graphics 
//Man sagt nur das sich alle Paintable wie Graphics verhalten soll
public interface Paintable {
	void paintTo(java.awt.Graphics g);
}
