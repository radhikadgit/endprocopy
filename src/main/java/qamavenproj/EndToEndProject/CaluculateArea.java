package qamavenproj.EndToEndProject;

public class CaluculateArea {

	public static void main(String[] args) {

		CaluculateArea area = new CaluculateArea();
		area.areaOfSquare(5);
		int area_Rectangle = area.areaOfRectangle(4, 5);
		System.out.println("Area Of Rectangle : " + area_Rectangle);
		double area_circle = area.areaOfCircle(2);
		System.out.println("Area Of Circle : " + area_circle);
		area.areaOfCylinder(2, 3);

	}

	public void areaOfSquare(int side) {

		int areaSq = side * side;
		System.out.println("Area Of Square : " + areaSq);
	}

	public int areaOfRectangle(int length, int width) {
		int areaRect = length * width;
		return areaRect;
	}

	public double areaOfCircle(double radius) {

		double pi = 3.14;
		double areaCir = pi * radius * radius;
		return areaCir;
	}

	public void areaOfCylinder(double radius, double height) {
		double pi = 3.14;
		double areaCyli = 2 * pi * radius * radius * height;
		System.out.println("Area Of Cylinder : " + areaCyli);
	}
}
