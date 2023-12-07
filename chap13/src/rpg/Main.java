package rpg;

public class Main {

	public static void main(String[] args) {
		King king = new King();
		Hero h = new Hero("ミナト");
		king.talk(h);
		String name = null;
		h.setName(name);
	}

}
