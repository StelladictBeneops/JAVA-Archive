//Ariez Othus
//Exercise 9.6
//A class to represent a ticket bought in advance
public class AdvanceTicket extends Ticket {
public int days;

	public AdvanceTicket(int days) {
		super(); 
		days = this.days;
	}
	public double getPrice() {
		if (days > 10) {
		getPrice = 30.0;
		return getPrice;
		}
		else if (days < 10){
		getPrice = 40.0;
		return getPrice;
		}
	return getPrice;
	}
}