package vi51.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.UUID;

import javax.swing.JPanel;

import org.arakhne.afc.math.continous.object2d.Point2f;

import vi51.environment.AgentBody;
import vi51.util.Semantic;

public class Unit {

	protected UUID id;
	protected Semantic type;
	protected Point2f position;
	
	public Unit(AgentBody a){
		position = a.getPosition();
		type = a.getSemantic();
		id = a.getId();
	}
	
	public void setPosition(Point2f position) {
		this.position = position;
	}

	public void paint(Graphics g,BufferedImage image, JPanel container)
	{
		Graphics2D g2d = (Graphics2D) g;
		float posX = position.getX() * 5;
		float posY = position.getY() * 5;
		g2d.drawImage(image, (int) posX, (int) posY, container);
	}
	
}