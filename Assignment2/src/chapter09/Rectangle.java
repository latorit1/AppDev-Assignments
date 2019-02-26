package chapter09;

// Ch09_01 class
public class Rectangle {

	public double width;
	public double height;
	
	Rectangle(){
		width = 1;
		height = 1;
		
	}
	
	Rectangle(double width, double height) {
		
		this.width = width;
		this.height = height;
		
	}
	
	public double getArea() {
		
		double area = width*height;
		return area;
	}
	
	public double getPerimeter() {
		
		double perimeter = (width*2) + (height*2);

		return perimeter;
	}
	
}
