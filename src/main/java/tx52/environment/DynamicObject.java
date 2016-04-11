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
	private UUID id;
	private Body body;
	
	//Agentid créé son corps : on appellera ce constructeur lors de la création de l'agent
	// P.S : la position x,y sera surement donné par l'agent également
	public DynamicObject(float x, float y,UUID agentId, World w){
		super(x,y);
		id = agentId;
		// peut-être inutile si l'agent a déjà un ID : ID agent = ID body
		if (id == null) {
			id = UUID.randomUUID();
		}
		BodyDef bd = new BodyDef();
		bd.position.set(x, y);
		bd.type = BodyType.KINEMATIC;
		Vec2[] vertices = { new Vec2(0.0f, -10.0f), new Vec2(+10.0f, +10.0f), new Vec2(-10.0f, +10.0f) };
		PolygonShape ps = new PolygonShape();
		ps.set(vertices, vertices.length);

		FixtureDef fd = new FixtureDef();
		fd.shape = ps;
		fd.density = 0.5f;
		fd.friction = 0.3f;
		fd.restitution = 0.5f;

		body = w.createBody(bd);
		body.createFixture(fd);
	}

}
