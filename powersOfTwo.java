//Ariez Othus
//ENGR 142 
//Ex. 3.5

import java.util.*;
public class powersOfTwo {
	public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
	System.out.print("Enter the power you would like to see 2 raised to: ");
		int x = console.nextInt();

		powerz(x);
	}
	public static void powerz(int x){

System.out.println("That would be: " + Math.pow(2.0,x)); 

}
}