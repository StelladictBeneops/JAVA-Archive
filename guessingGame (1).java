//Ariez Othus
//ENGR 142
//Chapter 5, Project 4
//COMPLETE!

import java.io.*;
import java.util.*;

public class guessingGame {

	static Random randy = new Random();

	static String y = "y";
	static String n = "n";
	public static Scanner console = new Scanner(System.in);

public static void main(String[] args) {
		
		int count = 1;
		int guess = randy.nextInt(10) + 1;

	System.out.print("This program has you, the user, choose a number/n between 1 and 10. Then I, the computer, will try my best to guess it: ");
	
	System.out.println("\nIs it " + guess + "? (y/n)");

	String UI = console.nextLine();

	while (UI.equals(y)){
	System.out.println("I got your number of " + guess + " correct in " + count + " guesses.");
	break;
	}
	while (UI.equals(n)){
	count = counter(count);
	String reGuess = reGuess(guess, count);
		if (reGuess.equals(y)){
			break;		
			}

	}
}
	public static int counter(int count) {
		count += 1;
		return(count);
		}

	public static String reGuess(int guess, int count) {
		guess = randy.nextInt(10) + 1;	
		
		System.out.println("\nIs it " + guess + "? (y/n)");
		String UI = console.nextLine();
		if (UI.equals(y)){
			System.out.println("I got your number of " + guess + " correct in " + count + " guesses.");
		}
		return(UI);
		
	}
}

