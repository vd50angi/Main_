package day1_hW;

import java.util.Scanner;

public class Question6 {

	 public static void main(String[] args) {
		 
		 int number_month; // determine the month
		 String month;  // actual month
		 
	 }
		
		Scanner season = new Scanner(System.in);
		//Enter the month by number from 1 to 12 ex. January is 1
		System.out.println("Enter the month by number:"); // user enter  the value
		
		number_month = season.nextInt(); //allow the user to enter the value
		switch(number_month) {  //switch provide multi branching
		case 1:
			month = "January";
			
		case 2:
			month:"February";
		
		System.out.println("Season: Winter");
		System.out.println("Month: " + month)
		
		break; // break statement allow  to exit the  entire switch statement and start another one
				
		case 3:
			month:"March";
		case 4:   
		     month: "April";
		case 5:
		    month = "May";
		 
		    System.out.println("Season: Spring");
		    System.out.println("Month: " + month);
			
		    break;
		    
		case 6:
		 month = "June";
		 
		case 7:
			month = "July";
			
		case 8: 
			month = "August";
		
		System.out.println("Season:Summer");
		System.out.println("Month: " + month)
		;
		
		break;
		
		case 9: 
		month = "September";
		
		case 10:
			month = "October";
			
		case 11:
		  month = "November";
		  System.out.println("Season:Autumn");
		  System.out.println("Month: " + month); 
			
			break;
			
		case 12:
			month = "December";
			System.out.println("Season:Winter");
			System.out.println("Month: " + month); 
			
			break;
			default:
				System.out.println("Invalid Month");
		}
}

		  
}	
		
		
		
		
		
		
	
		
	 
	
	
	

/*Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons.
 *  When her teacher tells a month, she needs to say the season corresponding to that month.
Write a program to solve the above task.
•	Spring – March to May,
•	Summer – June to August,
•	Autumn – September to November and,
•	Winter – December to February.
Month should be in the range 1 to 12.  If not the output should be “Invalid month”.
Sample Input 1:
•	Enter the month:11
Sample Output 1:
•	Season:Autumn
Sample Input 2:
•	Enter the month:13
Sample Output 2:
•	Invalid month*/


