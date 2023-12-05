package rpg.monster;

public class Main {

	public static void main(String[] args) {
		Goblin goblin = new Goblin();
		goblin.attack();
		goblin.run();
		
		Werewolf wolf = new Werewolf();
		wolf.attack();
		wolf.run();
		
		DeathBat bat = new DeathBat();
		bat.attack();
		bat.run();

	}

}
