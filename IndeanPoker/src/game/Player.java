package game;

public class Player {
	Card card;
	String result;
	String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void judge(Player target) {
		if (this.card.num == target.card.num) {
			this.result = "draw";
		} else if (this.card.num == 1) {
			this.result = "win";
		} else if (target.card.num == 1) {
			this.result = "lose";
		} else if (this.card.num > target.card.num) {
			this.result = "win";
		} else {
			this.result = "lose";
		}
	}
	
	public String toString() {
		return name + ":" + card + ":" + result;
	}
}
