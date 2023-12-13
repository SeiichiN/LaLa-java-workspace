package rpg;

public class Place {
	private String scene;                // この場所の説明
	private Object obj;                  // モンスター、アイテム

	public Object getObj() {
		return obj;
	}
	public String getScene() {
		return scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}
	public void setObj(Object obj) {     // オブジェクト型に変換して格納
		this.obj = obj;
	}
}
