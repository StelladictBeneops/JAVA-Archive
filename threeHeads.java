//Ariez Othus
//ENGR 142
//Chapter 5, Project 11
//COMPLETE!

import java.io.*;
import java.util.*;

public class threeHeads {

Scanner console = new Scanner(System.in);
static Random randy = new Random();

static String[] fruits = { "H", "T" };
static int counter = 0;

public static void main(String[] args) {

counter = counter();
if (counter == 3) {
System.out.println("\n\nCongratulations! You got three heads in a row after... flips!");
} else
System.out.println("\n\nHarro? " + counter);
}

public static int counter() {

while(counter != 3) {
int HT = randy.nextInt(2);
if (HT == 0) {
System.out.print(fruits[HT] + " "); 
counter = counter + 1;
} else { 
System.out.print(fruits[HT] + " ");
counter = 0;
}
}
return counter;
}
} 
