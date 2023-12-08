package ex13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard() {
		this.wand = new Wand();
	}
	
	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = 
			(int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println
		    (h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public void setName(String name) {
		if ( name == null || name.length() < 3) {
			throw new IllegalArgumentException
		    ("名前は3文字以上必要です");
		}
		this.name = name;
		
//		if (name != null && name.length() >= 3) {
//			this.name = name;
//		} else {
//			throw new IllegalArgumentException
//			    ("名前は3文字以上必要です");
//		}
	}

	public Wand getWand() {
		return wand;
	}

	public void setHp(int hp) {
		if (hp < 0) { hp = 0; }
		this.hp = hp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException
			("mpは0以上です");
		}
		this.mp = mp;
	}

	@Override
	public String toString() {
		return "Wizard [hp=" + hp + ", mp=" + mp + ", name=" + name + ", wand=" + wand + "]";
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public String getName() {
		return name;
	}
}
