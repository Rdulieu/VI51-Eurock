package tx52.environment;

public class EnvironmentObject {
	
	private Position position;
	private MinimumBoundingRectangle box;
	private enum ObjectType {
		StaticObject, DynamicObject;
	}
	
	public EnvironmentObject(float x, float y) {
		position = new Position(x, y);
		box = new MinimumBoundingRectangle();
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
	
}