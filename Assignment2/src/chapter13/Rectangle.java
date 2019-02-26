package chapter13;

// Ch09_01 class
public class Rectangle {

	public double width;
	public double height;
	public String color;
	public boolean filled;
	
	Rectangle(){
		width = 1;
		height = 1;
		color = "white";
		
	}
	
	Rectangle(double width, double height, String color, boolean filled ) {
		
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
		
	}

	public void setColor(String color) {
		this.color = color;
		
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
