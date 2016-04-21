package tx52.environment;

import java.util.UUID;

import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.BodyType;
import org.jbox2d.dynamics.FixtureDef;
import org.jbox2d.dynamics.World;

public class DynamicObject extends EnvironmentObject{
	
	//Agentid créé son corps : on appellera ce constructeur lors de la création de l'agent
	// P.S : la position x,y sera surement donné par l'agent également
	/**
	 * 
	 * @param x
	 * @param y
	 * @param width -> we may delete it
	 * @param height -> we may delete it
	 * @param agentId
	 * @param w
	 */
	public DynamicObject(float x, float y,float width,float height,UUID agentId,World w){
		super(x,y,width,height);
		id = agentId;
		// peut-être inutile si l'agent a déjà un ID : ID agent = ID body
		if (id == null) {
			id = UUID.randomUUID();
		}
		BodyDef bd = new BodyDef();
		bd.position.set(x, y);
		bd.type = BodyType.KINEMATIC; //maybe DYNAMIC type is better
		Vec2[] vertices = { new Vec2(0.0f, -10.0f), new Vec2(+10.0f, +10.0f), new Vec2(-10.0f, +10.0f) };
		PolygonShape ps = new PolygonShape();
		ps.set(vertices, vertices.length);

		FixtureDef fd = new FixtureDef();
		fd.shape = ps;
		fd.density = 0.5f;
		fd.friction = 0.3f;
		fd.restitution = 0.5f;
		fd.userData = id; 
		// what is userdata ? can we store UUID in this field ?

		body = w.createBody(bd);
		body.createFixture(fd);
		
		//set the box to the exact object
	/*
		for (b2Fixture* f = body->GetFixtureList(); f; f = f->GetNext())
		{
			b2Shape::Type shapeType = fixture->GetType();
			if ( shapeType == b2Shape::e_circle )
			{
			    b2CircleShape* circleShape = (b2CircleShape*)fixture->GetShape();
			    //do something
			}
			else if ( shapeType == b2Shape::e_polygon )
			{
			    b2PolygonShape* polygonShape = (b2PolygonShape*)fixture->GetShape();
			    //do something
			}
		}
		
		box.add(x, y);
	*/
	}

}