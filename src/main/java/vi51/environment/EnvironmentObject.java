package vi51.environment;

import java.util.UUID;

import org.arakhne.afc.math.continous.object2d.Point2f;
import org.arakhne.afc.math.continous.object2d.Rectangle2f;
import org.jbox2d.dynamics.Body;

public class EnvironmentObject {
	
	protected Point2f position;
	protected Rectangle2f box;
	protected UUID id;
	protected Body body; //utile ?
	// pas besoin du type objectType. On utilisera l'héritage 
	
	/**
	 * creation of the object with his position (x,y)
	 * @param x
	 * @param y
	 * @param id
	 */
	public EnvironmentObject(float x, float y, UUID id) { 
		this.id = id;
		if(id==null)id=UUID.randomUUID();
		this.position = new Point2f(x, y);
		this.box = new Rectangle2f(position,position);
	}
	
	/**
	 * creation of the object with his position and dimensions
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public EnvironmentObject(float x, float y,float width,float height,UUID id) {
		this.id = id;
		if(id==null)id=UUID.randomUUID();
		box = new Rectangle2f(x,y,width,height);
		box.setFromCenter(x,y,x+width/2,y+height/2);
		position = new Point2f(box.getCenterX(),box.getCenterY());
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
	
	@Override	
	public String toString(){
		
		return "UUID : " + id + "   Position : (" + position.getX() + "," + position.getY() + ")";
		
	}
	
}