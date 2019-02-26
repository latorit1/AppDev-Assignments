package chapter10;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ch10_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account[] arr = new Account[10];
		
		for (int i = 1; i < 11; i++) {
            arr[i - 1] = new Account(i, 100.0);
        }

        System.out.print("Enter an id: ");
        int id = sc.nextInt();
        
        if (id < 1 || id > 10) {
            id = incorrectId(id);
        }

        while (true) {
            menuDisplay();
            System.out.print("Enter a choice: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.printf("%nEnter an id (1 - 10): ");
                id = sc.nextInt();

                if (id < 1 || id > 10) {
                    id = incorrectId(id);
                }
            }
            performChoice(id, choice, arr);
        }
    }

    public static int incorrectId(int id) {
        Scanner sc = new Scanner(System.in);
        while (id < 1 || id > 10) {
            System.out.print("Please enter a valid id: ");
            id = sc.nextInt();
            System.out.println();
        }
        return id;
    }

    public static void performChoice(int id, int choice, Account[] accounts) {
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1: 
                System.out.printf("The balance is $%.1f%n",
                accounts[id - 1].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                accounts[id - 1].withdraw(sc.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                accounts[id - 1].deposit(sc.nextDouble());
                break;
            default:
                break;
        }
    }

    public static void menuDisplay() {
        System.out.printf("%nMain menu%n");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
}

