//Ariez Othus
//ENGR 142 
//Project 3.4
//Refered to A. Tophe for math help, and David and KEL for programming/debugging/programming error help
import java.util.*;
public class anglesOfTriangle {
    public static void main(String[] args) {
        
        //input of lenths
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the lengths of the sides of your triangle, starting with the larges one(s): ");
        double a = console.nextDouble();
        System.out.print("Enter your second length: ");
        double b = console.nextDouble();
        System.out.print("Enter your third length: ");
        double c = console.nextDouble();
		  //declaring angles        
        double A = angleA(a, b, c);
        double B = angleB(a, b, c);
        double C = angleC(A, B);
        //checking to ensure measurements are viable
        if ( (a + b <= c) || (b + c <= a) || (a + c <= b) ) {
           System.out.println("\nLengths are invalid, please restart the program and try again.");
	        }
		  //measurements check out and it gives you your angles        
        else if (a + b > c && b + c > a && a + c > b) {
            System.out.println("\nYour first angle is: " + A);
            System.out.println("Your second angle is: " + B);
	    System.out.println("Your third angle is: " + C);
        }
    }
			//moved the Math.toDegrees statement down because converting from the radians to degrees after doing the math with pi 
			//in my third statement below "anglesC" made my third length C 0.19123... degrees too small. Converting to degrees 
			//before that lowers this margin of error, results may still be off by 0.11111... though. 
			 
			//equations to compute your angles.
		    static double angleA (double a, double b, double c){
		        double A =  Math.toDegrees((Math.acos((Math.pow(b,2.0) + Math.pow(c,2.0) - Math.pow(a,2.0)) / (2.0 * b * c))));
		    return A;}
		    
		    static double angleB (double a, double b, double c){
		        double B =  Math.toDegrees((Math.acos((Math.pow(a,2.0) + Math.pow(c,2.0) - Math.pow(b,2.0)) / (2.0 * a * c))));
		    return B;}
		    
		    static double angleC (double A, double B) {
		        double C =  (180 - A - B);
		    return C;}
}