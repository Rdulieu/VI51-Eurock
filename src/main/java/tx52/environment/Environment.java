package tx52.environment;

import java.util.ArrayList;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;

public class Environment {
	World world;
	//float timeStep;
	//int velocityIterations;
	//int positionIterations;
	
	ArrayList<EnvironmentObject> objectsList;
	
	public Environment () {
		Vec2 gravity = new Vec2(0.0f, 0.0f);
		boolean doSleep = true;
		this.world = new World(gravity,doSleep);
		this.objectsList = null;
	}
	
}
