package rpg;

public class Main {

	public static void main(String[] args) {
		Character c = new Wizard();
		
		Matango m = new Matango('A');
		c.name = "アサカ";
		c.attack(m);
		
		Wizard w = (Wizard) c;
		w.fireball(m);
		
	}

}
