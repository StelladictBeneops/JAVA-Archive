//Ariez Othus
//Exercise 9.6
//A class to represent a ticket bought in advance by a student
public class StudentAdvanceTicket extends AdvanceTicket {
public int days;

	public StudentAdvanceTicket(int days) {
		super(); 
		this.days = days;
	}
	public String toString() {
		return "Number: " + this.ticket + ", Price: " + (super.getPrice()/2) + " (ID required)";
	}
}
