package jp.co.pana.main;

import java.util.Random;

public class Com extends Player {
	public Com(String name) {
		super(name);
	}

	public void setHand() {
		this.hand = new Random().nextInt(3);
	}
}
