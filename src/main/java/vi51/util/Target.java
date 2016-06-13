package vi51.util;

import java.util.UUID;

import org.arakhne.afc.math.continous.object2d.Point2f;

public class Target {
	UUID targetID;
	Point2f targetPosition;
	
	public Target(UUID targetID, Point2f targetPosition) {
		super();
		this.targetID = targetID;
		this.targetPosition = targetPosition;
	}

	public UUID getTargetID() {
		return targetID;
	}

	public void setTargetID(UUID targetID) {
		this.targetID = targetID;
	}

	public Point2f getTargetPosition() {
		return targetPosition;
	}

	public void setTargetPosition(Point2f targetPosition) {
		this.targetPosition = targetPosition;
	}

	public boolean isEmpty() {
		return targetID.equals(null);
	}
	
	

}
