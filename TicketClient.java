import java.util.*;
import java.io.*;
public class TicketClient{

	public static void main(String[] args){
	String y = "y";
	String n = "n";
	Scanner console = new Scanner(System.in);
		System.out.println("Are you paying for your ticket in advance? (y/n) ");
			String UI = console.nextLine();
		if (UI.equals(n)){
			WalkUpTicket ticket = new WalkUpTicket();
			System.out.println(ticket.toString());
			}
				
		if (UI.equals(y)){
			System.out.println("Are you a student? (y/n) ");
				String UI2 = console.nextLine();
					if (UI2.equals(y)) {
						System.out.println("How many days in advance are you buying this ticket? ");
						int UI3 = console.nextInt();
						StudentAdvanceTicket ticket = new StudentAdvanceTicket(UI3);
						System.out.println(ticket.toString());
						}
					if (UI2.equals(n)) {
						System.out.println("How many days in advance are you buying this ticket? ");
						int UI4 = console.nextInt();
						AdvanceTicket ticket = new AdvanceTicket(UI4);
						System.out.println(ticket.toString());
			}
		}
	}
}
