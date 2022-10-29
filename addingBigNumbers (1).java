import java.util.*;
import java.lang.*;

public class addingBigNumbers {

public static int n = 50;
public static double mx = (1*Math.pow(10, n-1));
public static int maxLength = (int)mx;

public static void main(String[] args) {

Scanner console = new Scanner(System.in); 

System.out.print("Enter first integer: ");
int A = console.nextInt();
String AA = Integer.toString(A); 

System.out.print("Enter second integer: ");
int B = console.nextInt();
String BB = Integer.toString(B);

if (AA.length() > maxLength || BB.length() > maxLength){
System.out.println(factorial(A, B));
}

else {
System.out.println(A + " + " + B + " = " + (A+B));
}
}

public static String factorial(int A, int B){
	int b = (A % maxLength) + (B % maxLength);

	int c = (b % maxLength);

	int a = (A/maxLength) + (B/maxLength) + c;
	
	String factorial = (A + "/n + " + B + "/n = " + a + b);  
	return factorial;
}
}