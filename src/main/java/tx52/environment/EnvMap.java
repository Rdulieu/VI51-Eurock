package tx52.environment;

import java.util.Collection;

/**
 * the world map
 * 
 * @author rdulieu
 *
 */

public class EnvMap {
	
	private RTree objectList;
	
	EnvMap(Collection<EnvironmentObject> objects){
		objectList = new RTree(objects);
	}

}
