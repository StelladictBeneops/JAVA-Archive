//Ariez Othus
//ENGR 142
//Chapter 7, exercise 11
//COMPLETE!

import java.util.*;

public class isUnique{
	public static void main(String[] args){
		int[] list = {1, 2, 3, 4, 3};
		Arrays.sort(list); 
		int[] list2 = {1, 2, 3, 4, 5};
		Arrays.sort(list2); 

		String TF = isUnique(list);
		String TF2 = isUnique(list2);
		
		System.out.println(TF + ", " + TF2);
	}
	public static String isUnique (int[] list){
	String isUnique = "true";
		for(int x = 0; x < list.length - 1; ++x) {
			if (list[x] == list[x + 1]) {	
			isUnique = "false";
			return(isUnique);
			}
		}
	return(isUnique);
	}
}