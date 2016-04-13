package tx52.environment;

import java.util.ArrayList;
import java.util.Collection;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;

public class Environment {
	World jBoxWorld;
	EnvMap world;
	//float timeStep;  // c'est plutot l'agent qui contient cette variable 
	//int velocityIterations;
	//int positionIterations;
	
	//ArrayList<EnvironmentObject> objectsList; //not the good choice for data structure
	
	public Environment (Collection<EnvironmentObject> objects) {
		Vec2 gravity = new Vec2(0.0f, 0.0f);
		boolean doSleep = true;
		this.jBoxWorld = new World(gravity/*,doSleep*/);
		this.world = new EnvMap(objects);
	}	
	
	
	
}
