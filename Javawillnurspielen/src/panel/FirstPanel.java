package panel;
import javax.swing. *;
import java.awt.Color;

//Draw Methode 
public class FirstPanel extends JPanel{
 
@Override public void paintComponent(java.awt.Graphics g) {
	g.setColor(Color.red);
	g.fillRect(30,50, 45, 80);
	}
	
}
