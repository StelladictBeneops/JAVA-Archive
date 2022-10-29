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

double A = angleA(a, b, c);
double B = angleB(a, b, c);
double C = angleC(A, B);


if ( (a + b <= c) || (b + c <= a) || (a + c <= b) ) {
System.out.print("Lengths are invalid, please re-enter three valid lengths: ");
double a = console.nextDouble();
System.out.print("Enter your second length: ");
double b = console.nextDouble();
System.out.print("Enter your third length: ");
double c = console.nextDouble();
}

else if (a + b > c && b + c > a && a + c > b) {
System.out.println("Your first angle is: " + A);
System.out.println("Your second angle is: " + B);
System.out.println("Your third angle is: " + C);
}
}
static double angleA (double a, double b, double c){
double A = (Math.acos((Math.pow(b,2.0) + Math.pow(c,2.0) - Math.pow(a,2.0)) / (2.0 * b * c)));					
return A;}							

static double angleB (double a, double b, double c){	
double B = (Math.acos((Math.pow(a,2.0) + Math.pow(c,2.0) - Math.pow(b,2.0)) / (2.0 * a * c)));
return B;}

static double angleC (double a, double b, double c){
double C = (3.14 - A - B);			 		
return C;}
}
}
}