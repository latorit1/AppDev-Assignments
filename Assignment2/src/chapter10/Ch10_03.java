package chapter10;

public class Ch10_03 {

	public static void main(String[] args) {
		
		MyInteger test = new MyInteger(51);
		
		System.out.printf("Is prime?", test.getValue(), test.isPrime());
		System.out.printf("Is even?", test.getValue(), test.isEven());
		
		System.out.printf("Is odd?", test.getValue(), test.isOdd());
		
		System.out.printf("%d%n", MyInteger.parseInt("45"));
	}

}
