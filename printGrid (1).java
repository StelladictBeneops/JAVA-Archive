//Ariez Othus
//ENGR 142 
//Ex. 3.5

import java.util.*; 
public class printGrid{

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Enter number of rows down:  ");
		int x = number.nextInt();
		
		System.out.print("Enter number of columns across: ");
		int y = number.nextInt();
		
		printGrid(x,y);		
	}
	public static void printGrid(int x, int y){
		for (int i = 1; i <= x; i++) {
			System.out.print(i + " ");


				for (int j = 1; j <= y - 1; j++) {
					int z = i + (j * x);
					System.out.print(z + " ");
				}
				System.out.println();
		}

	}

}