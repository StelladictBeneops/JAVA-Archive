import java.util.*;

public class scaryLookingThing {
public static void main(String[] args) {

int[] sushi = {1, 3, 2, 5};

System.out.println("Standard deviation = " + stdev(sushi));

}

public static double stdev(int[] sushi){
int x = 0; 
 
for(int j = 0; j < sushi.length; ++j) {
x = sushi[j] + x;
}

double average = ((double)x/(double)sushi.length);

double i = 0.0;

for(int k = 0; k < sushi.length; ++k) {
i = (Math.pow((sushi[k] - average), 2.0) + i);
}

double U = Math.sqrt((i/(sushi.length-1)));
return U;
}

}
