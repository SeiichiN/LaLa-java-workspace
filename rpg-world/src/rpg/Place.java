package rpg;

public class Place {
	Object obj;
	String scene;
	
	public Place() {
		this.obj = null;
		this.scene = "特に何も見当たりません。";
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
