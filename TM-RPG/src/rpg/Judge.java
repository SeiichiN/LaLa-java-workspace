package rpg;

import java.lang.reflect.Array;

/**
 * このクラスは何をするためのクラスなのか？
 */
public class Judge {

	Battle vs = new Battle();

	public void judgement(Character c) {
		// このメソッドが呼ばれるたびにモンスターが生まれる
		Monster[] monsters = new Monster[6];
		monsters[0] = new Goblin("ゴブリン", 'A');
		monsters[1] = new Goblin("ゴブリン", 'B');
		monsters[2] = new DeathBat("デスバット", 'A');
		monsters[3] = new DeathBat("デスバット", 'B');
		monsters[4] = new Matango("マタンゴ", 'A');
		monsters[5] = new Matango("マタンゴ", 'B');

		for (Monster m : monsters) {
			m.autoMove();
		}
		
		while (true) {
			if (sumXY(monsters) == 0) {
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
			checkMove(c);
			
			for (Monster m : monsters) {
				if (c.x == m.x && c.y == m.y) {
					System.out.println(" ------------------------------------");
					System.out.println("| なにかが草むらから飛び出してきた！");
					vs.battle(c, m);
					m.delete(m);
					// break;
				}
			}
			
		}
	}

	private int sumXY(Monster[] monsters) {
		int sum = 0;
		for (Monster m : monsters) {
			sum += (m.x + m.y);
		}
		return sum;
	}
	
	private void checkMove(Character c) {
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
		
	}
}
