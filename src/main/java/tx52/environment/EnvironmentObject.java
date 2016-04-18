package tx52.environment;

import org.arakhne.afc.math.continous.object2d.Point2f;
import org.arakhne.afc.math.continous.object2d.Rectangle2f;

public class EnvironmentObject {
	
	private Point2f position;
	private Rectangle2f box;
	// pas besoin du type objectType. On utilisera l'héritage 
	
	/**
	 * creation of the object with his position (x,y)
	 * @param x
	 * @param y
	 */
	public EnvironmentObject(float x, float y) { 
		position = new Point2f(x, y);
		box = new Rectangle2f(position,position);
	}
	
	/**
	 * creation of the object with his position and dimensions
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public EnvironmentObject(float x, float y,float width,float height) {
		position = new Point2f(x, y);
		box = new Rectangle2f(position.getX(),position.getY(),width,height);
	}
	
	public Rectangle2f getBox() {
		return box;
	}
	public void setBox(Rectangle2f box) {
		this.box = box;
	}
	public Point2f getPosition() {
		return position;
	}
	public void setPosition(Point2f position) {
		this.position = position;
	}
	
}