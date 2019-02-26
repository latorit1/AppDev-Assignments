package chapter13;

import java.util.Scanner;

public class Ch13_01 {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 
		 	System.out.print("Enter three sides of a triangle: ");
		 	double side1 = sc.nextDouble();
		    double side2 = sc.nextDouble();
		    double side3 = sc.nextDouble();
		    
		    System.out.print("Enter a triangle color: ");
		    String color = sc.next();
		    
	        System.out.print("Is the triangle filled? ");
		    boolean filled = sc.nextBoolean();
		    
	        Triangle t1 = new Triangle(side1, side2, side3, color, filled);
	        t1.setColor(color);
	        t1.setFilled(filled);
	        System.out.println("Triangle 1:");
	        System.out.println("Area = " + t1.getArea());
	        System.out.println("Perimeter = " + t1.getPerimeter());
	        System.out.println("Color = " + t1.getColor());
	        System.out.println("Is filled? " + t1.isFilled());

	}

}
