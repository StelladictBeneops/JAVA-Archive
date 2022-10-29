//Ariez Othus
//ENGR 142
//Chapter 5, exercise 3
//Citation: http://download.oracle.com/javase/1.5.0/docs/api/java/lang/Integer.html

import java.lang.*;
import java.util.*;

public class toBinary {
	public static void main(String args[]){

			Scanner console = new Scanner(System.in);
	System.out.print("Enter your integer here: ");
		int x = console.nextInt();
		
		String y = 	Integer.toBinaryString(x);


System.out.println("That is " + y + " in binary.");
}
}