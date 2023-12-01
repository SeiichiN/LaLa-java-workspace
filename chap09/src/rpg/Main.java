package rpg;

public class Main {

	public static void main(String[] args) {
		
		Hero h1 = new Hero("ミナト");
		Hero h2 = new Hero();
		Wizard w = new Wizard("スガワラ");
		
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println("--------------------");
		h1.attack();
		System.out.println(h2.name);
		

		

	}

}
