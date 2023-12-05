package birdland;

public class BathToy {
	String name;
	
	public BathToy(String name) {
		this.name = name;
	}
	
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}
}
