package birdland;

public class Bird {
	String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	public void quack() {
		System.out.println(this.name + "はガアガア鳴く");
	}
	
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}
}
