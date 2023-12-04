package suika;

public class GetDistanceTest {

	public static void main(String[] args) {
		Suika suika = new Suika();
		User user = new User();
		double distance = suika.getDistance(user, suika);
		System.out.println("distance:" + distance);
	}

}
