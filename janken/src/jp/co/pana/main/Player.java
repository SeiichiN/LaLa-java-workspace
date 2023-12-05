package jp.co.pana.main;

public abstract class Player {
	int hand;
	String name;
	
	public Player() {}
	public Player(String name) {
		this.name = name;
	}
	
	abstract public void setHand();
}
