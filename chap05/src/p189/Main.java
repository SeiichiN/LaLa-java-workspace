package p189;

/**
 * p177練習4-4をメソッドに分割する
 */
public class Main {
	
	public static int[] readyNumbers() {
		int n1, n2, n3;
		n1 = new java.util.Random().nextInt(9) + 1;

		do {
			n2 = new java.util.Random().nextInt(9) + 1;
		} while (n1 == n2);

		do {
			n3 = new java.util.Random().nextInt(9) + 1;
		} while (n1 == n3 || n2 == n3);
		
		int[] numbers = {n1, n2, n3};
		return numbers;
	}
	
	public static int inputNumber() {
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		return input;
	}
	
	public static void showResult(int input, int[] numbers) {
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

	public static void main(String[] args) {
		int[] numbers = readyNumbers();
		int input = inputNumber();
		showResult(input, numbers);
	}

}
