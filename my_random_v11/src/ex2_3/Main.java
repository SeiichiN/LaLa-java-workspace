package ex2_3;

public class Main {

	public static void main(String[] args) {
		String name = "Taro";
		String ageString = "23";
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4) + 1;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、" + 
				"あなたの運気番号は" + fortune + "です。");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");

	}

}
