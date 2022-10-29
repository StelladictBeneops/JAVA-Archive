import java.util.*;
import java.io.*;

public class madLibs {

public static void main(String[] args) throws FileNotFoundException{

Scanner console = new Scanner(System.in);

PrintStream sushi = new PrintStream(new File("sushi.txt"));

System.out.print("Type a file name to use: ");
String filename = console.nextLine();
Scanner input = new Scanner(new File(filename));

String Arrays[] = new String[5]; 
//DONE FOR EASE OF PROGRAMMIMG L:)
System.out.print("Please type in a adjective: ");
Arrays[0] = console.nextLine();
System.out.print("Please type in a plural-noun: ");
Arrays[1] = console.nextLine();
System.out.print("Please type in a noun: ");
Arrays[2] = console.nextLine();
System.out.print("Please type in a another adjective: ");
Arrays[3] = console.nextLine();
System.out.print("Please type in a place: ");
Arrays[4] = console.nextLine();

int i = 0; 
while(input.hasNextLine()) {
String line = input.nextLine();
//takes line of text, scans and checks for our "<" character.
for(int j = 0; j < line.length(); ++j) {

if (line.substring(j, j+1).equals("<")) {
//System.out.println("YAY! :)");	
line = line.replace(line.substring(line.indexOf("<"), line.indexOf(">") + 1), Arrays[i]);
i++;
}
}
sushi.println(line);
}
}
}