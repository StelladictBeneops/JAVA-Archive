//Ariez Othus
//Client program to demonstrate methods within class "Line"
//Exercises 8.9-11
public class LineClient{

		public static void main(String[] args){

			Point p1 = new Point(2,3);
			Point p2 = new Point();
			Line L1 = new Line(p1, p2);
			Line L2 = new Line(1, 2, 3, 4);
			System.out.println("Line: " + L1.toString());
			System.out.println("Slope of that line: " + L1.getSlope());
			System.out.println("Another line: " + L2.toString());
			System.out.println("Slope of that line: " + L2.getSlope());
		}
}