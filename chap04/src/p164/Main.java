package p164;

public class Main {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayA[1] = 10000;
		System.out.println(arrayB[1]);  // 100
	}

}
