package day1_hW;

import java.util.Scanner;
import java.text.DecimalFormat;

//Find the fuel Consuption distance/fuel
		/* 1 km = 0..6214 miles
		 * i liter = 0.2642
		 * Result should be 2 decimal places... import text.Decimal Format
		 * 100 KM fuel consumption  (no of liters fill the tank/distance covered * 100
		 * km into miles = distance covered * 0.6214
		 * miles per gallons = no. of liters to fill the tank *0.2642
		 * find miles per gallon = distance covered * 0.6214 / no of liters fill the tank *0.2642
		 * Note: if the quantity  or distance display to zero ..display invalid input
		 */
		


public class Question1 {
	
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the no. of liters to fill the tank:");
		
		double fuelConsumption = in.nextInt();
		
		if (fuelConsumption<=0) {
			
			System.out.println("Invalid input");
			System.exit(0);;
		}
			System.out.println( "Enter the distance covered: ");
			double distance = in.nextDouble();
			if ( distance<=0) {
				
				System.out.println("Invalid input: ");
				System.exit(0);
			}
			
			double kmPerLiter = (fuelConsumption/ distance) * 100;
			double milesPerGallon = ((distance * 0.6214/ fuelConsumption * 0.2642));
			
			System.out.println( "Liters/100KM");
			System.out.println(new DecimalFormat("#0.00"). format(kmPerLiter));
			
			System.out.println("Miles/gallons");
			
			System.out.println(new DecimalFormat("#0.00"). format (milesPerGallon));
			

			in.close(); // close the scanner
			
		}




		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

}
