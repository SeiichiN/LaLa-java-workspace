package ex13.test;

import ex13.Wizard;

public class WizardTest {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		System.out.println(w.getWand());
		w.setHp(-10);
		w.setMp(12);
		System.out.println(w);

	}

}
