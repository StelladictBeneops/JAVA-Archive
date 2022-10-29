//Ariez Othus
//ENGR 142
//Chapter 7, exercise 15
//COMPLETE!

import java.util.*;

public class collapsingArrays {
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};
		System.out.print("Array #1 contains: ");
		for(int x = 0; x < list.length; ++x) {
			if (x < list.length) {	
			System.out.print(list[x]+", ");
			}
			else if (x == list.length) {
			System.out.print(list[x]);
			}
		}			
		int[] collapsed = collapse(list);
		System.out.print("\nCollapsed it contains: ");
		for(int y = 0; y < collapsed.length; ++y) {
			if (y < collapsed.length) {	
			System.out.print(collapsed[y] + ", ");
			}
			if (y == collapsed.length) {
			System.out.print(collapsed[y]);
			}
		}					
	}
	
	public static int[] collapse(int[] list){	
	int[] collapsed = new int[(list.length/2)+1];
		if(list.length % 2 !=0)	{
			collapsed[collapsed.length-1] = list[list.length-1];
		}		
		int k = 0;
		for(int z = 0; z < list.length-1; z+=2) {	
			collapsed[k]= list[z] + list[z+1];
			++k;
		}
		return(collapsed);
	}
}