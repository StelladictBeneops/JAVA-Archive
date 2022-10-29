//Ariez Othus
//Client program to demonstrate methods within class "RationalNumbers"
//Project 8.1
public class RationalNumberClient{

		public static void main(String[] args){
		
			RationalNumber p1 = new RationalNumber(2, 11);
			RationalNumber p2 = new RationalNumber();
			//throws error for the denominator
				//RationalNumber p3 = new RationalNumber(0, 0);			
			System.out.println("Two rational numbers: " + p1.toString() + ", " + p2.toString());
		}
}
			