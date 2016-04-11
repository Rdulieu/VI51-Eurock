package tx52.environment;

public class EnvironmentObject {
	
	private Position pos;
	public enum ObjectType {
		StaticObject, DynamicObject;
	}

	public EnvironmentObject(float x, float y) {
		pos = new Position(x, y);

	}

	class Position {
		float x;
		float y;

		public Position(float x2, float y2) {
			// TODO Auto-generated constructor stub
			this.x = x2;
			this.y = y2;
		}

		public float getX() {
			return x;
		}

		public void setX(float x) {
			this.x = x;
		}

		public float getY() {
			return y;
		}

		public void setY(float y) {
			this.y = y;
		}

	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

}
