package birdland;

public class Main {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck("マガモ");
		mallardDuck.fly();
		mallardDuck.quack();
		mallardDuck.swim();

		Duck duck = new Duck("アヒル");
		duck.quack();
		duck.swim();
		
		RabberDuck rDuck = new RabberDuck("ラバーダック");
		rDuck.swim();

	}

}
