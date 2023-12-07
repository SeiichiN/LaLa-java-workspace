package rpg.monster;

public abstract class Monster {
	private int hp;
	private String type;
	
	public Monster() {
		this.hp = hp;
		this.type = "monster";
	}
	public Monster(String type) {
		this.type = type;
	}

	public void run() {
		System.out.println("モンスターは逃げ出した");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return type;
	}
}
