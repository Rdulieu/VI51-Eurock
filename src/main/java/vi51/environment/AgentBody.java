package vi51.environment;

import java.util.UUID;

import org.jbox2d.dynamics.World;

public abstract class AgentBody extends DynamicObject{
	
	private final UUID agentId;
	private final float perceptionDistance;
	
	AgentBody (float x, float y,float width,float height,UUID agentId,World w, float perceptionDistance) {
		super (x,y,width,height,agentId,w);
		this.perceptionDistance = perceptionDistance;
		this.agentId = agentId;
	}

	public UUID getAgentId() {
		return agentId;
	}

	public float getPerceptionDistance() {
		return perceptionDistance;
	}
}
