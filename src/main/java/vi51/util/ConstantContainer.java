package vi51.util;

import java.awt.Dimension;

//This class contains all constants of the engine
public class ConstantContainer {
	
	//Agent or Body Related
	public static final int NB_AGENTS = 1;
	
	public static final float BASIC_PERCEPTION_DISTANCE=50f;
	public static final float BASIC_MAX_LINEAR_SPEED=1f;
	public static final float BASIC_MAX_ANGULAR_SPEED=0.2f;
	public static final float BASIC_RADIUS=1;
	public static final float PRIVATE_RADIUS=4;
	public static final int ZOMBIE_RANGE=2;
	public static final int BASIC_LIFE = 100;
	public static final int BASIC_DAMAGE= 10;

	
	public static final int BASIC_MUSIC_DESIRE=800;
	public static final int BASIC_THIRSTY=500;
	public static final int BASIC_HUNGRY=500;
	public static final int BASIC_PEE=100;
	public static final int MAX_DESIRE=1000;
	
	public static final int MUSIC_PRIORITY_DIFFERENCE = 100;
	public static final int PEE_PRIORITY_DIFFERENCE = 200;
	public static final int HUNGRY_PRIORITY_DIFFERENCE = 200;
	public static final int THIRSTY_PRIORITY_DIFFERENCE = 200;
	
	//Influence related
	public static final String MOTION_TYPE="MOTION";
	public static final String SHOOT_TYPE="SHOOT";
	
	//JBOX2D related
	public static final float BASIC_DENSITY = 0.5f;
	public static final float BASIC_FRICTION = 0.3f;
	public static final float BASIC_RESTITUTION = 0.5f;
	
	public static final int VELOCITY_ITERATIONS = 6;
	public static final int POSITION_ITERATIONS = 2;
	
	//Time Related
	public static final float DELTA_T = 1.0f / 2.0f;
	
	//MAP Related
	public static final float MAP_WIDTH = 200;
	public static final float MAP_HEIGHT = 200;
	
	public static final float MAP_LIMIT_MIN_X = 20;
	public static final float MAP_LIMIT_MIN_Y = 20;
	public static final float MAP_LIMIT_MAX_X = 40;
	public static final float MAP_LIMIT_MAX_Y = 40;
	
	public static final int RANDOM_SPAWN_RANGE_X = 15;
	public static final int RANDOM_SPAWN_RANGE_Y = 15;
	public static final int RANDOM_SPAWN_VISITOR_X = 170;
	public static final int RANDOM_SPAWN_VISITOR_Y = 170;
	public static final int RANDOM_SPAWN_BODYGUARD_X = 50;
	public static final int RANDOM_SPAWN_BODYGUARD_Y = 50;
	public static final int RANDOM_SPAWN_ZOMBIE_X = 100;
	public static final int RANDOM_SPAWN_ZOMBIE_Y = 100;
	
	//TREE Related
	public static final int NB_MAX_OBJECT_IN_NODE = 10;
	public static final int NB_CHILDREN = 4;
	public static final int MAX_FPS = 20;
	public static final int FRAME_PERIOD = 1000/MAX_FPS;
	
	//GUI Related
	public static final Dimension BG_SIZE = new Dimension (1000,1000);
	public static final Dimension VIEWPORT_SIZE = new Dimension (800,600);
	
	//TEST Related
	public static final int TIME_TO_TEST = 1000;

}
