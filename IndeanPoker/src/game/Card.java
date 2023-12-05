package game;

public class Card {
	String suit;
	int num;
	
	public Card(String suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	public String toString() {
		return suit + ":" + num;
	}
}
