package p209;

public class Main {
	
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
		array[0] = 100;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array);
		System.out.println(array[0]);  // 100
	}

}
