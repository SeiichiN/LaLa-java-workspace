package ex4_4;

public class Main {

	public static void main(String[] args) {
		int n1, n2, n3;
		n1 = new java.util.Random().nextInt(9) + 1;

		do {
			n2 = new java.util.Random().nextInt(9) + 1;
		} while (n1 == n2);

		do {
			n3 = new java.util.Random().nextInt(9) + 1;
		} while (n1 == n3 || n2 == n3);
		
		int[] numbers = {n1, n2, n3};
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		boolean atari = false;
		for (int number : numbers) {
			if (input == number) {
				atari = true;
				break;
			}
		}
		if (atari) {
			System.out.println("あたり");
		} else {
			System.out.println("はずれ");
		}

	}

}
