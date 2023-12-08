package ex13;

import java.util.Random;

public class Wand {
	private String name;
	private double power;
	
	public Wand() {
		this.name = "魔法の杖";
		// this.power = (double) (Math.random() * 99.5) + 0.5;
		this.power = new Random().nextDouble(0.5, 100);
	}
	
	public String getName() {
		return name;
	}
	public double getPower() {
		return power;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3 ) {
			throw new IllegalArgumentException
		    ("名前は3文字以上必要です");
		}
		this.name = name;
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException
		    ("増幅率は0.5以上100以下です");
		}
		this.power = power;
	}

	@Override
	public String toString() {
		return "name:" + name + " power:" + power;
	}
}
