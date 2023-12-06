package rpg;

public class Main3 {

	public static void main(String[] args) {
		Character c = new Wizard();
		if (c instanceof Hero) {
			Hero h = (Hero) c;
			h.slip();
		} else {
			System.out.println("無理っス");
		}

	}

}
