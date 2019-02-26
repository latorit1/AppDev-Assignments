package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch11_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter 10 integers: ");
		
		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt());
		}
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
	}

	}
}
