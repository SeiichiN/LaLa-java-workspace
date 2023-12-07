package ex12;

public class Main {

	public static void main(String[] args) {
		X obj = new A();
		obj.a();
		System.out.println("-------------");
		
		Y y1 = new A();
		Y y2 = new B();
		y1.a();
		y2.a();

	}

}
