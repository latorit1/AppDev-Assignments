package chapter09;

public class Ch09_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account(1122, 20000);
		a.setRate(4.5);
		a.deposit(3000);
		a.withdraw(2500);
		
		System.out.println(a.getBalance());
		System.out.println(a.getMonthlyInterest());
		System.out.println(a.getDateCreated());
	}

}
