package suika;

public class InputTest {

	public static void main(String[] args) {
		Suika suika = new Suika();
		User user = new User();
		double distance = 0.0;
		distance = suika.getDistance(user, suika);
		System.out.println("distance:" + distance);
		while (distance > 0.0) {
			user.move();
			distance = suika.getDistance(user, suika);
			System.out.println("distance:" + distance);
		}
		System.out.println("スイカを割った!!");
	}

}
