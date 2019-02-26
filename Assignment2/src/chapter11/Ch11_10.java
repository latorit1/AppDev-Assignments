package chapter11;

import java.util.Scanner;

public class Ch11_10 {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 5 strings: ");
        for (int i = 1; i <= 5; i++) {
        	stack.push(sc.next());
        }

        System.out.println("Reverse order: ");
        
        for (int i=1; i <=5; i++) {
            System.out.println(stack.pop());
        }
 
	}

}
