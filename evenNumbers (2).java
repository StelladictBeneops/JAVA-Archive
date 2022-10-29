//Ariez Othus
//ENGR 142
//Chapter 6, exercise 2
//COMPLETE!

import java.util.*;
import java.io.*;

public class evenNumbers {

public static void main(String[] args) throws FileNotFoundException{
Scanner console = new Scanner(System.in);

String filename = "sushi2.txt";
Scanner input = new Scanner(new File(filename));
Scanner input2 = new Scanner(new File(filename));
Scanner input3 = new Scanner(new File(filename));

int odd = 0;
int even = 0;
int sum = 0; 
int total = 0;
double percent = 0;

odd = odd(odd, input);
even = even(even, input2);
sum = sum(sum, input3); 
total = odd + even;
percent = percent(even, total, percent);

System.out.println("" + total + " numbers, sum = " + sum + "\n" + even + " evens (" + percent + ")");

}
	
public static int even (int even,Scanner input){
while(input.hasNextInt()) { 
int x = input.nextInt();

if (x % 2 == 0) {
even = even + 1;
}
}
return even;
}
public static int odd (int odd, Scanner input){
while(input.hasNextInt()) { 
int x = input.nextInt();

if (x % 2 != 0) {
odd = odd + 1;
}
}
return odd;
}

public static int sum (int sum, Scanner input){
while(input.hasNextInt()) { 
int x = input.nextInt();

sum = sum + x;
}
return sum;
}

	
public static double percent (double even, double total, double percent){
percent = (even/total)*100.0;
return percent;
}
	
	
}