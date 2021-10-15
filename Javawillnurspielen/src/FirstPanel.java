import javax.swing. *;
import java.awt.Color;
public class FirstPanel extends JPanel{
 
@Override public void paintComponent(java.awt.Graphics g) {
	g.setColor(Color.red);
	g.fillRect(100,100, 50, 50);
	g.fillRect(300,100,50, 50);
	g.fillRect(150,300,150, 50);
	g.fillRect(100,350, 50, 50);
	g.fillRect(300,350, 50, 50);
}
	
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.add(new FirstPanel());
		f.pack();
		f.setVisible(true);
	}
}
