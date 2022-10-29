// A program that deals with points.
// Fourth version of this client code found on page 531 of our text, to accompany the Point class.

public class PointMain {
	public static void  main(String[] args) {

	//creates two point objects
	Point p1 = new Point(7, 2);
	Point p2 = new Point(4, 3);
	
	// print each point its distance from the origin
	
	System.out.println("P1 is " + p1);
	System.out.println("distance from origin = " +
							p1.distanceFromOrigin());
	System.out.println("p2 is " + p2);
	System.out.println("distance from origin = " +
							p2.distanceFromOrigin());						

	// translate each point to a new location 
	p1.translate(11, 6);
	p2.translate(1, 7);
	
	//print the points again
	System.out.println("p1 is " + p1);
	System.out.println("p2 is " + p2);
	}
}