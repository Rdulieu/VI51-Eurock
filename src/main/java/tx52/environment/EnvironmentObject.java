package tx52.environment;

public class EnvironmentObject {
	
	private Position position;
	private MinimumBoundingRectangle box;
	
	EnvironmentObject(float x, float y) {
		pos = new Position(x, y);

	}
	
	public MinimumBoundingRectangle getBox() {
		return box;
	}
	public void setBox(MinimumBoundingRectangle box) {
		this.box = box;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	private enum ObjectType {
		StaticObject, DynamicObject;
	}
	
}