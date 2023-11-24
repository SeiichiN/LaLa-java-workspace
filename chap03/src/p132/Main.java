package p132;

public class Main {

	public static void main(String[] args) {
		outOfFor:
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j == 3) {
					break outOfFor;
				}
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
