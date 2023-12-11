
package rpg;

public class Battle {

	public void battle(Character c, Monster m) {
		Judge god = new Judge();

		System.out.println("| " + m.getName() + m.getSuffix() + "が現れた!!");
		System.out.println(" ------------------------------------");

		while (c.getHp() > 0 && m.getHp() > 0) {

			if (c.getHp() > 0) {
				System.out.println("【" + c.getName() + ":残りHP" + c.getHp() + "】");
				System.out.println("【" + m.getName() + m.getSuffix() + ":残りHP" + m.getHp() + "】");
				c.attack(m);
			}
			if (m.getHp() <= 0) {
				System.out.println("『" + m.getName() + m.getSuffix() + "は倒れた！』");
				System.out.println("『戦闘が終了した為、フィールドに戻ります』");
				System.out.println("                                    ");
				god.judgement(c);
				break;
			}

			if (m.getHp() > 0) {
				m.attack(c);
			}
			if (c.getHp() <= 0) {
				System.out.println(" ------------------------------------");
				System.out.println("| " + c.getName() + "は倒れた！");
				System.out.println("| GAME OVER");
				System.out.println(" ------------------------------------");
				break;
			}

		}
	}
}
