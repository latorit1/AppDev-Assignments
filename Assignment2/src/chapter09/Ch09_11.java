package chapter09;

import java.util.Scanner;

public class Ch09_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, and f: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		
		LinearEquation check = new LinearEquation(a, b, c, d, e, f);
		if (check.isSolvable()) {
			System.out.println("x is equal to " + check.getX() + " and Y is equal to " + check.getY());
		}
		else {
			System.out.println("The equation has no solution.");
		}
	}

}
