package my_random;

public class Main {

	public static void main(String[] args) {
		String name = "Taro";
		String ageString = "23";
		int age = Integer.parseInt(ageString);
		int fortune = new MyRandom().nextInt(1, 5);
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、" + 
				"あなたの運気番号は" + fortune + "です。");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");

	}

}
