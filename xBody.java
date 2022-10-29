//Ariez Othus 
//ENGR 142 
//K. Laidig 
//Exercise 2.1 


public class xBody { 
	public static void main(String[] args) { 
		//declare variables
		double time;
		double Pos;
		double Vel;
		double Acc;
		double Answer;

		//computes stuff
		time = 20.0;
		Pos = 360.0;
		Vel = 25;
		Acc = 80;

		Answer = Pos + (Vel * time) + 1/2 * Acc * (time*time);

		//prints results
		System.out.println("Position of x body in linear motion at time of 20:");
		System.out.println(Answer);
	}
}