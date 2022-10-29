//A Point object represents a pait of (x, y) coordinates.
//Based off of the fourth version of Point class from page 530 in the textbook
public class Point {
	private int x;
	private int y;
	
	//constructs a new point at the origin, (0,0)
	public Point() {
		this(0, 0);
	}
	
	//constructs a new point with the given (x, y) location
	public Point(int x, int y) {
		setLocation(x, y);
	}
	
	//returns the distrance between this point and (0, 0)
	public double distanceFromOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	
	//returns the x-coordinate of this point
	public int getX() {
		return x;
	}
	
	//returns the y-coordinate of this point
	public int getY() {
		return y;
	}
	
	//sets this point's (x, y) location to the given values
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	} 
	
	//shifts this point's location by the given amount
	public void translate(int dx, int dy) {
		setLocation(x + dx, y + dy);
	}

	//returns a string representation of this point
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}