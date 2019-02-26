package chapter09;

public class Ch09_01 {
	public static void main(String[] args) {
	
	Rectangle r1 = new Rectangle(4,40);
	Rectangle r2 = new Rectangle(3.5,35.9);
	Rectangle r3 = new Rectangle();
	
	System.out.println("The first rectangle has a width of " + r1.width + " and a height of " + r1.height + "." );
	System.out.println("With an area of " + r1.getArea());
	System.out.println("And a perimeter of " + r1.getPerimeter());
	
	System.out.println("");
	
	System.out.println("The second rectangle has a width of " + r2.width + " and a height of " + r2.height + "." );
	System.out.println("With an area of " + r2.getArea());
	System.out.println("And a perimeter of " + r2.getPerimeter());
	
	
	
	
	}
}


