package ex3_3;

public class Main {

	public static void main(String[] args) {
		int isHangry = 0;
		String food = "Sushi";
		System.out.println("こんにちは");
		if (isHangry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
//		if (isHangry == 1) {
//			System.out.println(food + "をいただきます");
//		}
		System.out.println("ごちそうさまでした");
	}

}
