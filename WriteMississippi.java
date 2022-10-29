//Ariez Othus 
//ENGR 142 
//K. Laidig 
//Project 1.1 

public class WriteMississippi { 
	public static void main(String[] args) { 
		writeM(); 
		writeI(); 
		writeS(); 
		writeS(); 
		writeI(); 
		writeS(); 
		writeS(); 
		writeI(); 
		writeP(); 
		writeP(); 
		writeI(); 
	} 
	public static void writeM() { 
		Num065(); 
		Num099(); 
		Num085(); 
		Num073(); 
		int x = 0; 
		while (x < 3) { 
		Num065();x++; } 
		Num000();
		} 
	public static void writeI() { 
		Num127(); 
		int x = 0; 
		while (x < 5) { 
		Num008();x++; } 
		Num127(); 
		Num000();
	} 
	public static void writeS() { 
		Num062(); 
		Num065(); 
		Num064(); 
		Num062(); 
		Num001(); 
		Num065(); 
		Num062(); 
		Num000();
	} 
	public static void writeP() { 
		Num126(); 
		Num065(); 	
		Num065(); 
		Num126(); 
		int x = 0; 
		while (x < 3) { 
		Num064();x++;} 
		Num000();
	} 
// standard value of binary value of each line if M=1 and 0=_

	public static void Num000() { 
		System.out.println(); 
	} 
	public static void Num001() { 
		System.out.println("      M"); 
	} 
	public static void Num008() { 
		System.out.println("   M   "); 
	} 
	public static void Num062() { 
		System.out.println(" MMMMM "); 
	} 
	public static void Num064() { 
		System.out.println("M      "); 
	} 
	public static void Num065() { 
		System.out.println("M     M"); 
	} 
	public static void Num073() { 
		System.out.println("M  M  M"); 
	} 
	public static void Num085() { 
		System.out.println("M M M M"); 
	} 
	public static void Num099() { 
		System.out.println("MM   MM"); 
	} 
	public static void Num126() { 
		System.out.println("MMMMMM "); 
	} 
	public static void Num127() { 
		System.out.println("MMMMMMM"); 
	} 
}