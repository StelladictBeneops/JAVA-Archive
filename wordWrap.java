import java.util.*;
import java.io.*;

public class wordWrap {

public static void main(String[] args) throws FileNotFoundException{
Scanner console = new Scanner(System.in);

System.out.print("Type a file name to use: ");
String filename = console.nextLine();
Scanner input = new Scanner(new File(filename));
PrintStream sushiNew = new PrintStream(new File("sushiNew.txt"));

while(input.hasNextLine()) {

String s = input.nextLine();

int max = 5;

char[] sAr = s.toCharArray();
int start = 0;
for (int i = max; i < sAr.length; i++) {
System.out.println(s.substring(start, i));
sushiNew.println(s.substring(start, i));


start = i;
i += max-1;
}

System.out.println(s.substring(start));
sushiNew.println(s.substring(start));

}
}
}