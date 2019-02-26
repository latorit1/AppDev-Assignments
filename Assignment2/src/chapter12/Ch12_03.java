package chapter12;

import java.util.Scanner;

public class Ch12_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = getArray();

		System.out.print("Enter the index of the array: ");
		try {
			System.out.println("The corresponding element value is " + 
				array[sc.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException out) {
			System.out.println("Out of Bounds.");
		}
	}

	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}

}


