package chapter11;

import java.util.Scanner;

public class ch11_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the 3 sides of the triangle: ");
	        double s1 = sc.nextDouble();
	        double s2 = sc.nextDouble();
	        double s3 = sc.nextDouble();
	        System.out.print("Enter the color: ");
	        String color = sc.next();
	        System.out.print("Is the triangle filled: ");
	        boolean fill = sc.nextBoolean();
	        
	        Triangle triangle = new Triangle(s1, s2, s3);
	        triangle.setColor(color);
	        triangle.setFilled(fill);
	        
	        System.out.println("Triangle perimeter:" +  triangle.getPerimeter());
	        System.out.println("Triangle area: " + triangle.getArea());
	        System.out.println("Triangle color: " + triangle.getColor());
	        System.out.println("Triangle filled: " + triangle.isFilled());
	          

	}

}
