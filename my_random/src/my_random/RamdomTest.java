package my_random;

import java.util.Random;

public class RamdomTest {

	public static void main(String[] args) {
		Random r1 = new Random(123456789L);
		Random r2 = new Random(123456788L);
		System.out.println(r1.nextInt(10));
		System.out.println(r2.nextInt(10));
		System.out.println(r1.nextInt(10));
		System.out.println(r2.nextInt(10));

	}

}
