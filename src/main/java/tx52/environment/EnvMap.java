package tx52.environment;

import java.util.Collection;

import org.arakhne.afc.math.continous.object2d.Rectangle2f;

/**
 * the world map
 * 
 * @author rdulieu
 *
 */

public class EnvMap {
	
	//TODO create a list of RTree that represent the world -> Cohen Sutherland ?
	private RTree objectList;
	
	//Parameters of the world
	static final float width=100; 
	static final float height=100;
	
	public RTree getObjectList() {
		return objectList;
	}

	public void setObjectList(RTree objectList) {
		this.objectList = objectList;
	}

	/**
	 * Initialisation
	 * @param objects
	 */
	EnvMap(Collection<EnvironmentObject> objects){
		objectList = new RTree(objects,new Rectangle2f(0,0,width,height));
	}

	/**
	 * Add an object
	 * @param objects
	 */
	public void addObjects(Collection<EnvironmentObject> objects) {
		for( EnvironmentObject o : objects){
			objectList.getRoot().add(o);
		}
	}

}
