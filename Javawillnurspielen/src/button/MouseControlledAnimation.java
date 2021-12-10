package button;
import java.awt.event.*;

import config.GameObject;
import config.Vertex;
import image.MovableImage;
import panel.MovablePanel;
import util.ShowInFrame;

public class MouseControlledAnimation extends RemoveAnimation{
GameObject controlled;

MouseControlledAnimation(final GameObject contr){
	controlled=contr;
	gos.add(controlled);
	


addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
		final Vertex delta = new Vertex(e.getX(),e.getY());
		delta.addMod(controlled.getPos().skalarMult(-1));
		delta.addMod(new Vertex(-controlled.getWidth()/2,-controlled.getHeight()/2));
		final double factor =controlled.getDeltaPos().length()/delta.length();
		delta.skalarMultMod(factor);
		controlled.setDeltaPos(delta);
	}

}
);
}
	
	
	public static void main(String[] args) {
		MovablePanel p = new MouseControlledAnimation(new MovableImage("images/hexe.png",200,200,1,1));
		p.gos.add(new MovableImage("images/bat.png",800,800,-1,-1));
		ShowInFrame.show(p);

	}

}
