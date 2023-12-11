package rpg;

import java.lang.reflect.Array;

public class Judge {

	Battle vs = new Battle();
//	Monster[] array = new Monster[6];

	public void judgement(Character c) {
		Monster m0 = new Goblin("ゴブリン", 'A');
		Monster m1 = new Goblin("ゴブリン", 'B');
		Monster m2 = new DeathBat("デスバット", 'A');
		Monster m3 = new DeathBat("デスバット", 'B');
		Monster m4 = new Matango("マタンゴ", 'A');
		Monster m5 = new Matango("マタンゴ", 'B');

		m0.autoMove();
		m1.autoMove();
		m2.autoMove();
		m3.autoMove();
		m4.autoMove();
		m5.autoMove();

		while (true) {
			if (m0.x + m0.y + m1.x + m1.y + m2.x + m2.y + m3.x + m3.y + m4.x + m4.y + m5.x + m5.y == 0) {
				System.out.println("フィールド内の全てのモンスターを倒した！");
				System.out.println("GAME CLEAR！");
				break;
			}
			System.out.println(" ------------------------------------");
			System.out.println("| " + c.getName() + ":残りHP" + c.getHp());
			System.out.println("| " + c.getName() + "の現在地は" + c.x + "の" + c.y + "です。");
			System.out.println("| しかし、ここには何もいないようだ…");
			System.out.println(" ------------------------------------");
			c.move();

			if (c.x > 5) {
				c.x -= 1;
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!WARNING!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("これ以上東に進むとキャラクターが戦闘領域から抜けてしまいます！");
			}
			if (c.x < 1) {
				c.x += 1;
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!WARNING!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("これ以上西に進むとキャラクターが戦闘領域から抜けてしまいます！");
			}
			if (c.y > 5) {
				c.y -= 1;
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!WARNING!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("これ以上北に進むとキャラクターが戦闘領域から抜けてしまいます！");
			}
			if (c.y < 1) {
				c.y += 1;
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!WARNING!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("これ以上南に進むとキャラクターが戦闘領域から抜けてしまいます！");
			}

			if (c.x == m0.x && c.y == m0.y) {
				System.out.println(" ------------------------------------");
				System.out.println("| なにかが草むらから飛び出してきた！");
				vs.battle(c, m0);
				m0.delete(m0);
				break;
			} else if (c.x == m1.x && c.y == m1.y) {
				System.out.println(" ------------------------------------");
				System.out.println("| なにかが草むらから飛び出してきた！");
				vs.battle(c, m1);
				m1.delete(m1);
				break;
			} else if (c.x == m2.x && c.y == m2.y) {
				System.out.println(" ------------------------------------");
				System.out.println("| なにかが草むらから飛び出してきた！");
				vs.battle(c, m2);
				m2.delete(m2);
				break;
			} else if (c.x == m3.x && c.y == m3.y) {
				System.out.println(" ------------------------------------");
				System.out.println("| なにかが草むらから飛び出してきた！");
				vs.battle(c, m3);
				m3.delete(m3);
				break;
			} else if (c.x == m4.x && c.y == m4.y) {
				System.out.println(" ------------------------------------");
				System.out.println("| なにかが草むらから飛び出してきた！");
				vs.battle(c, m4);
				m4.delete(m4);
				break;
			} else if (c.x == m5.x && c.y == m5.y) {
				System.out.println(" ------------------------------------");
				System.out.println("| なにかが草むらから飛び出してきた！");
				vs.battle(c, m5);
				m5.delete(m5);
				break;
			}
		}
	}

}
