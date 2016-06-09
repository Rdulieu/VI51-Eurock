package vi51.environment;

import java.util.UUID;

import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.BodyType;
import org.jbox2d.dynamics.FixtureDef;
import org.jbox2d.dynamics.World;

import vi51.util.ConstantContainer;
import vi51.util.Semantic;

public class StaticObject extends EnvironmentObject {
	

	public StaticObject(UUID id){
		super(id);
	}

	//Create a rectangular static object
	public StaticObject(float x, float y,float width,float height,UUID id,World w,EnvMap map){
		super(width,height,id);
		BodyDef bd = new BodyDef();
		bd.position.set(x,y);  
		bd.type = BodyType.STATIC;
		
		//test with circle shape
		PolygonShape ps = new PolygonShape();
		ps.setAsBox(width,height);
		
		//fixture test
		FixtureDef fd = new FixtureDef();
		fd.shape = ps;
		fd.density = ConstantContainer.BASIC_DENSITY;
		fd.friction = ConstantContainer.BASIC_FRICTION;        
		fd.restitution = ConstantContainer.BASIC_RESTITUTION;
		
		body =  w.createBody(bd);
		body.createFixture(fd);
	}
	
	public void setAsScene(String name){
		this.semantic=Semantic.Scene;
		this.name=name;
	}
	
	public void setAsToilet(String name){
		this.semantic=Semantic.Toilet;
		this.name=name;
	}
	
	public void setAsDrinkStand(String name){
		this.semantic=Semantic.DrinkStand;
		this.name=name;
	}
	
	public void setAsEatStand(String name){
		this.semantic=Semantic.EatStand;
		this.name=name;
	}
	
	public void setAsGate(String name){
		this.semantic=Semantic.Gate;
		this.name=name;
	}

}
