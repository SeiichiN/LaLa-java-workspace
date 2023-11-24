package ex3_3;

public class Main2 {

	public static void main(String[] args) {
		int isHangry = 0;
		String food = "Sushi";
		System.out.println("こんにちは");
		
		String msg = 
			(isHangry == 0) ? "お腹がいっぱいです" : "はらぺこです";
		System.out.println(msg);
		
		if (isHangry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}

}
