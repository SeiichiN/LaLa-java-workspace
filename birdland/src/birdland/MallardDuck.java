package birdland;

public class MallardDuck extends Bird {
	
	public MallardDuck(String name) {
	    super(name);
    }
	
	public void fly() {
		System.out.println(this.name + "は空を飛ぶ");
	}
}
