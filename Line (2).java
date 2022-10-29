//Ariez Othus
//Exersises 8.9-8.11

public class Line extends Point {
				//Excercise 8.9
	private Point p1;
	private Point p2;			
				
		//Excercise 8.11
	//constucts a new line the contains the given two points
	public Line(Point p1, Point p2) {
			this.p1 = p1;
			this.p2 = p2;
	}
	public Line(int x1, int y1, int x2, int y2) {
			p1 = new Point(x1,y1);
			p2 = new Point(x2,y2);

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
	public String toString(Point p1, Point p2) {
	String string = "[" + p1 + ", " + p2 + "]";
	return string;
	}
		//Excercise 8.10
	//returns the slope of a line
	public double getSlope(double x1, double y1, double x2, double y2){
	double slope = (y2 - y1) / (x2 - x1);
	return slope;
	}	
}