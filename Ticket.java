//Ariez Othus
//Exercise 9.4
//A class to represent an Ticket in general
import java.util.*;

public class Ticket {
public double getPrice;
public int ticket;

Random r = new Random();

	public Ticket() {
	this.ticket = r.nextInt(98) + 1;
	}
	public double getPrice() {
	getPrice = this.getPrice;
	return getPrice;
	}
	
	
	public String toString() {
	return "Number: " + this.ticket + ", Price: " + getPrice();
	}
}