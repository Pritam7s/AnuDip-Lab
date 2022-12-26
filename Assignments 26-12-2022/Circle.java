package abstractions;

import java.util.Scanner;

public class Circle {

	final double pi = 3.14;
	public double calcualteArea(double pi, int radius)
	{
		double area;
		area = pi* radius * radius;
		return area;
	}
	
	public double circum(double pi, int radius)
	{
		double cir;
		cir = 2 * pi * radius;
		return cir;
	}
	
	public static void main(String[] args) {

		Circle circle = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		int r = sc.nextInt();
		double result = circle.calcualteArea(circle.pi, r);
		System.out.println("Area of Circle: " + result);
		double circumference = circle.circum(circle.pi, r);
		System.out.println("Circumference: " + circumference);
	}

}
