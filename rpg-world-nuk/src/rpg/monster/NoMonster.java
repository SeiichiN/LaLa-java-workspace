package rpg.monster;

import rpg.charactor.Character;

public class NoMonster extends Monster {
	public NoMonster() {
		super("no");
	}

	@Override
	void attack(Character c) {}
}
