package chapter10;

public class MyInteger {

	private int value;
	
	public MyInteger(int value) {
		this.value = value;	
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return (value % 2) == 0;
	}
	
	public boolean isOdd() {
		return (value % 2) == 1;
	}
	
	public boolean isPrime() {
		 if (value == 1 || value == 2) {
	            return true;
		 }
		 else {
	        for (int i = 3; i * i <= value; i += 2)
	            if (value % i == 0) 
	                return false;
		 }
	        return true;
		 
	}
	
	public static boolean isEven(int a) {
		return (a % 2) == 0;
	}
	
	public static boolean isOdd(int a) {
		return (a % 2) == 1;
	}
	
	public static boolean isPrime(int a ) {
		 if (a == 1 || a == 2) {
	            return true;
		 }
		 else {
	        for (int i = 3; i * i <= a; i += 2)
	            if (a % i == 0) 
	                return false;
		 }
	        return true;
		
	}
	
	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}
	
	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}
	
	public static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}
	
	public boolean equals(int a) {
		if (value == a) {
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger a) {
		return a.equals(a);
	}
	
	public static int parseInt(char[] value) {
		int a = 0;
		for (char b : value) {
			a += Character.getNumericValue(b);
		}
		return a;
		
	}
	
	public static int parseInt(String a) {
		return Integer.parseInt(a);
	}
}
