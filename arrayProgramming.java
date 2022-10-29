//Ariez Othus
//Midterm

import java.util.*;
import java.io.*;

public class arrayProgramming {

public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	System.out.print("How many numbers would you like to work with?");
		int n = console.nextInt();
		int Arrays[] = new int[n-1];
	
	int total = 0;

	for (int i = 0; i < n; i++){
		System.out.print("\nPlease enter your number #" + ": ");  
		Arrays[n-i] = console.nextInt;
		}
	}
}
	public int getTotal (int total, int n, int[] Arrays){
		while (n > -1){
		total = total + Array[n];
		n-= 1;
		return n;
		}
	public double getAverage(double n, double total){
		double average = (total/average);
		return average;
		}
	public int getHighest(int n, int total){
		highest = 0;
		(int i = 0; i < n; i++){
		if (n-i > n){
		highest = Array[n];
		return highest;
		}
		}
		}
	public static int getLowest(double n, int[] Arrays){
		highest = lowest;
		(int i = 0; i < n; i++){
			if (n-i < n){
			highest = Array[n];
			return lowest;
			}
		}
	}
}