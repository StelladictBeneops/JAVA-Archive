//Ariez Othus
//ENGR 142
//Chapter 5, exercise 2
//COMPLETE!
//Citation: http://www.vogella.de/articles/JavaAlgorithmsEuclid/article.html
import java.util.*;

public class GreatestCommonDivisor {
public static void main(String[] args) {

Scanner console = new Scanner(System.in);

System.out.print("Enter integer: ");
int x = console.nextInt();
int y = console.nextInt();

int z = gcd(x, y); 
 
System.out.print("Your GCD is " + z);

}

 public static int gcd(int x, int y) { 
 	if (y == 0) {
	 	return x; } 
	return gcd(y, x % y); } 

} 