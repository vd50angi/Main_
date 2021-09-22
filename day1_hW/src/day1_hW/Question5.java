package day1_hW;
import java.util.Scanner;
import java.text.DecimaFormat;
public class Question5 {
	
	public static void main(String[]args) {
	Scanner tickets =  new Scanner(System.in);
	int numOfTickets, refreshment, total = 0;
	String typeOfTickets,coupon, circle;
	double ticketCost,regDiscount , bulkDiscount,specialCoupDiscount;
	
	System.out.println("Enter the number of tickets:");
	
	numOfTickets = tickets.nextInt();
	if (numOfTickets<5 || numOfTickets< 40) {
		System.out.println("Minimim of 5 and Maximum of 40 Tickets");
		
		}
	System.out.println("Do you want refreshment?:");
	typeOfTickets = tickets.next();
	System.out.print("Do you have a coupon?:");
	coupon = tickets.next();
	System.out.println("Enter the circle:");
	//circle value is only K and Q other than it's invalid
	
	circle =tickets.next();
	if(circle = "k") {
		total = numOfTickets * 75;
	}  else if (circle = "q") {
		total = numOfTickets * 150;
	}else {
		System.out.println("Invalid Input");
		
		if (numOfTickets > 20) {
			bulkDiscount = (total * (0.1));
			
			else if ()
		}
		
		
	}
	
	
	
	
	
	
	
		
	
	}

}
