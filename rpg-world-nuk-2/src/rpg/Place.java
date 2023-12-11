package rpg;

import main.Message;

public class Place {
	private int x;
	private int y;
	private Object obj;
	private String scene;
	
	public Place(int x, int y, Object obj) {
		this.x = x;
		this.y = y;
		this.obj = obj;
		this.scene = Message.NOTHING;
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
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}

	public String getScene() {
		return scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}
	
}
