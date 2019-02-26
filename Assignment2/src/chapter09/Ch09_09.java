package chapter09;

public class Ch09_09 {

	public static void main(String[] args) {
		
		RegularPolygon reg1 = new RegularPolygon();
		RegularPolygon reg2 = new RegularPolygon(6,4);
		RegularPolygon reg3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Regular Polygon 1 has a perimeter of " + reg1.getPerimeter() + " and an area of " + reg1.getArea());
		System.out.println("Regular Polygon 2 has a perimeter of " + reg2.getPerimeter() + " and an area of " + reg2.getArea());
		System.out.println("Regular Polygon 3 has a perimeter of " + reg3.getPerimeter() + " and an area of " + reg3.getArea());
	}

}
