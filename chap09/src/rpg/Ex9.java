package rpg;

public class Ex9 {
	public static void heal(int hp) {
		hp += 10;
	}
	
	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		System.out.println(baseHp + " : " + t.hp); // 25:25
		heal(baseHp);
		heal(t);
		System.out.println(baseHp + " : " + t.hp); // 25:35

	}

}
