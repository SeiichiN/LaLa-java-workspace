package rpg;

public class Main4 {

	public static void main(String[] args) {
		Matango m = new Matango('A');
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[0].name = "ヒーロー1";
		c[1] = new Hero();
		c[1].name = "ヒーロー2";
		c[2] = new Thief();
		c[2].name = "盗賊";
		c[3] = new Wizard();
		c[3].name = "魔女1";
		c[4] = new Wizard();
		c[4].name = "魔女2";
		for (Character ch : c) {
			ch.hp += 50;
			ch.attack(m);
		}
		
		Hero h = (Hero) c[0];
	}

}
