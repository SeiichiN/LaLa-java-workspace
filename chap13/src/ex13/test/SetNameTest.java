package ex13.test;

import ex13.Wand;

public class SetNameTest {

	public static void main(String[] args) {
		Wand w = new Wand();
		String name = "eee";
		w.setName(name);
		System.out.println(w.getName());
	}

}
