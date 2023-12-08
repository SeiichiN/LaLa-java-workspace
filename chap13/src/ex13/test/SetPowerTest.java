package ex13.test;

import ex13.Wand;

public class SetPowerTest {

	public static void main(String[] args) {
		Wand w = new Wand();
		double p = 0.5;
		w.setPower(p);
		System.out.println(w.getPower());
	}

}
