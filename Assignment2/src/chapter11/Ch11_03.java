package chapter11;

public class Ch11_03 {

	public static void main(String[] args) {
		
		Account account = new Account(2, 1000);
		SavingsAccount savings = new SavingsAccount(21, 4000);
		CheckingAccount checking = new CheckingAccount(1004, 3000, -20);

		account.setRate(4.5);
		savings.setRate(4.5);
		checking.setRate(4.5);

		account.withdraw(200);
		savings.withdraw(200);
		checking.withdraw(2500);

		account.deposit(300);
		savings.deposit(300);
		checking.deposit(300);

		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());

	}

}
