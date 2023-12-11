package rpg;

public class Place {
	private int x;
	private int y;
	private Object o;
	
	public Place(int x, int y, Object o) {
		this.x = x;
		this.y = y;
		this.o = o;
				
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Object getO() {
		return o;
	}
	public void setO(Object o) {
		this.o = o;
	}
	
}
