package rpg;

import rpg.charactor.Item;
import rpg.monster.Monster;
import rpg.monster.NoMonster;

public class Map {
	String name;
	Object obj;
	
	public Map() {
		this("");
	}

	public Map(String name) {
		this.name = name;
		// NoMonster n = new NoMonster();
		// setObj(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
