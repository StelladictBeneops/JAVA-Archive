//Ariez Othus
//ENGR 142 
//Ex. 3.5

import java.util.*; 
public class quadraticEquation{

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
					
		System.out.print("Enter your 'a' value: ");
		double a = number.nextDouble();
				
		System.out.print("Enter your 'b' value: ");
		double b = number.nextDouble();
		
		System.out.print("Enter your 'c' value: ");
		double c = number.nextDouble();
		
		System.out.println("x is equal to: " + y + ", " + z);
		
		double y = plus(a,b,c);
		double z = minus(a,b,c);				
		
		}
	
		public static double plus (double a, double b, double c){
		double y = ((-b + (Math.sqrt(Math.pow(b,2)- (4 * a * c))))/(2 * a));
		return y;
		}
				
		public static double minus (double a, double b, double c){
		double z = ((-b - (Math.sqrt(Math.pow(b,2) - (4 * a * c))))/(2 * a));
		return z;
		}
}