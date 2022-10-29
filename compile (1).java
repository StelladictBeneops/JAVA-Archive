//Ariez Othus
//ENGR 142
//Chapter 6, exercise 5
//COMPLETE!

import java.util.*;
import java.io.*;

public class compile {
 
public static void main(String[] args) throws FileNotFoundException{
Scanner input = new Scanner(new File("sushi.txt"));

System.out.println(readEntireFile(input)); 

} 

public static String readEntireFile(Scanner input) { 
		String sushi = ""; 
	
	while(input.hasNextLine()) { 
		sushi = sushi + input.nextLine(); 
		sushi = sushi + "\n"; 
		} 
	return(sushi); 
	} 
}

