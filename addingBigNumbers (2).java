import
java.util.*;

public class addingBigNumbers {
public static void main(String[] args) {

Scanner console = new Scanner(System.in); 


int maxLength = 50;
int i = 0; 

int[] a = new int [maxLength];

System.out.print("Enter first integer: ");
int A = console.nextInt();
String AA = Integer.toString(A);
for (int z = 0; z < AA.length(); z++){
a[z] = A % Math.pow(10, AA.length() - z);

}

int[] b = new int [maxLength];

System.out.print("Enter second integer: ");
int B = console.nextInt();
String BB = Integer.toString(B);
for (int y = 0; y < BB.length(); y++){
b[y] = B % Math.pow(10, AA.length() - y);
}

int[] c = new int [maxLength + 1];

for (i = 0 < maxLength; i + 2; i++) {
if (a[i] + b[i] + c[i] > 9){
c[i] = 1;
}
else if 
(a[i] + b[i] + c[i] <= 9){
c[i] = 0;
}
}
}
