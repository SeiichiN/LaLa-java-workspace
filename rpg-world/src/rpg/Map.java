package rpg;

import rpg.charactor.Item;
import rpg.monster.Monster;
import rpg.monster.NoMonster;

public class Map {
	String name;
	Monster monster;
	Item item;
	
	public Map() {}

	public Map(String name) {
		this.name = name;
		NoMonster n = new NoMonster();
		setMonster(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
