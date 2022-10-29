public class Line extends Point {

	//constructs a line segment between two points
	public Line(Point p1, Point p2) {
	}
	
	//returns the line's first endpoint
	public Point getP1 () {
	return p1;
	}
	//returns the line's second endpoint
	public Point getP2 () {	
	return p2;
	}
	//returns a string representation of this line
	public String toString() {
	return "";
	}

	//returns the slope of a line
	public double getSlope(){
	return slope;
	}

	//constucts a new line the contains the given two points
	public Line(int x1, int x2, int y1, int y2) {
	}
	
}