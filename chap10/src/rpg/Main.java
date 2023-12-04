package rpg;

public class Main {

	public static void main(String[] args) {
		PoisonMatango pm = new PoisonMatango('A');
		Hero h = new Hero();
		int count = 0;
		while (count < 6) {
			pm.attack(h);
			System.out.println("------------------");
			count++;
		}
	}

}
