package garden;

public abstract class Flower {
	String name;
	
	public Flower(String name) {
		this.name = name;
	}
	
    public void print() {
        System.out.println("わたしは" + this.name);
    }
}
