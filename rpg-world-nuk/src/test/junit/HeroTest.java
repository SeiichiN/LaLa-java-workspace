package test.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rpg.character.Hero;
import rpg.monster.Matango;

class HeroTest {

	@Test
	void instanceTest() {
		Hero h = new Hero("ミナト");
//		assertEquals("ミナト", h.getName());
		// fail("まだ実装されていません");
		Matango m = new Matango('A');
//		assertEquals('A', m.getSuffix());
		h.attack(m);
	}

}
