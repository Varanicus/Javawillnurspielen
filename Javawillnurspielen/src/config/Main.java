package config;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame f = new JFrame("Vertex-Game");
		f.pack();
		f.add(new FirstPanel());
		f.setVisible(true);

	}

}
