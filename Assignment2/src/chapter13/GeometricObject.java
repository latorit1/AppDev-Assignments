package chapter13;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color = "black";
	private boolean filled;

	  protected GeometricObject() {
	  }

	  protected GeometricObject(String color, boolean filled) {
	    this.color = color;
	    this.filled = filled;
	  }

	  public int compareTo(GeometricObject obj) {
	    if (this.getArea() > obj.getArea()) {
	      return 1;
	    }
	    else if(this.getArea() < obj.getArea()) {
	      return -1;
	    }
	    else {
	      return 0;
	    }
	  }

	  public String getColor() {
	    return color;
	  }

	  public void setColor(String color) {
	    this.color = color;
	  }

	  public boolean isFilled() {
	    return filled;
	  }

	  public void setFilled(boolean filled) {
	    this.filled = filled;
	  }

	  public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
	    int compare = obj1.compareTo(obj2);
	    if (compare == 1) {
	      return obj1; 
	      } 
	    else if (compare == -1) {
	      return obj2;
	      } 
	    else {
	      return obj1;
	      }

	  }


	  public abstract double getArea();

	  public abstract double getPerimeter();
}
