package jp.co.pana.main;

public abstract class Player {
	int hand;
	String name;
	String result;
	
	public Player() {}
	public Player(String name) {
		this.name = name;
	}
	
	abstract public void setHand();
	
	public void judge(Player target) {
		if (this.hand == target.hand) {
			this.result = "draw";
		} else if (this.hand == 0 && target.hand == 1) {
			this.result = "win";
		} else if (this.hand == 1 && target.hand == 2) {
			this.result = "win";
		} else if (this.hand == 2 && target.hand == 0) {
			this.result = "win";
		} else {
			this.result = "lose";
		}
	}
}
