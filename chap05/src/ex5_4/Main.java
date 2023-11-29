package ex5_4;

public class Main {
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2.0;
	}
	
	public static double calcCircleArea(double radius) {
		return Math.pow(radius, 2) * Math.PI;
	}

	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double area = calcTriangleArea(bottom, height);
		if (area == 25.0) {
			System.out.println("正しい");
		}
		double radius = 5.0;
		area = calcCircleArea(radius);
		System.out.println(area);
	}

}
