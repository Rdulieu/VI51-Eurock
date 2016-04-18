package tx52.environment;

import java.util.ArrayList;
import java.util.Collection;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;
import org.jbox2d.pooling.IWorldPool;

public class Environment {
	World jBoxWorld;
	EnvMap world;
	//float timeStep;  // c'est plutot l'agent qui contient cette variable 
	//int velocityIterations;
	//int positionIterations;
	
	//ArrayList<EnvironmentObject> objectsList; //not the good choice for data structure
	
	/**
	 * creation of the environment. Setup the Jbox2DWorld and create the EnvMap
	 * @param objects
	 */
	public Environment () {
		Vec2 gravity = new Vec2(0.0f, 0.0f);
		this.jBoxWorld = new World(gravity);
		jBoxWorld.setAllowSleep(true);
	}

	/**
	 * we assume that a body is always added to the Jbox2Dworld when it's created.
	 * @param objects
	 */
	public void addObjectToWorld(Collection<EnvironmentObject> objects) {
		if(this.world!=null){	
			this.world.addObjects(objects);
		}else{
			this.world = new EnvMap(objects);
		}
	}

	public World getjBoxWorld() {
		return jBoxWorld;
	}

	public void setjBoxWorld(World jBoxWorld) {
		this.jBoxWorld = jBoxWorld;
	}

	public EnvMap getWorld() {
		return world;
	}

	public void setWorld(EnvMap world) {
		this.world = world;
	}
	
	
	
}
