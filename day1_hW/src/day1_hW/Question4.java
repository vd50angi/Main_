package day1_hW;
import java.util.Scanner;

public class Question4 {
	
	int CSE;
	int MECH;
	int ECE;
	
	/*Find the maximum  maximum college department/
	 * if the input is negative the input should be invalid 
	 * and if all department is equal 
	 * the output should be "None of the departmentgot a highest placement"*/ 
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//CSE collegePlacement = new CSE();
		//ECE collegePlacement = new ECE();
		//MECH collegePlacement = new MECH();
		
		System.out.println("Enter the number of students placed in CSE:");
		System.out.println("Enter the number of students placed in ECE:");
		System.out.println("Enter the number of students placed in MECH:");
		
		if (CSE>ECE && MECH<=CSE) {
		
			System.out.println("The Department with the Highest Placement:");
			
			System.out.println("CSE");
		}
		
		else if (ECE>=Mech && CSE < MECH) {
			System.out.println("The Department with the Highest Placement:");
			System.out.println("ECE");
			System.out.println("Mech");
			
		}
		
		else  if (CSE == ECE  && MECH == ECE && MECH == CSE) {
			System.out.println("Enter the number of students placed in CSE:");
			System.out.println("Enter the number of students placed in ECE:");
			System.out.println("Enter the number of students  placed in MECH:");
			System.out.println("None of the Department has got the Highest Placement");
			
		}
		else  if (CSE<0 || ECE<0|| Mech<0) {
			
			System.out.println("CSE");
			System.out.println("ECE");
			System.out.println("MECH");
			System.out.println("Input is Invalid");
			
		}
		
	}
}
		
		
	
	
	
		

		
	                                                                                                                                                                                                                                   
		
		
		
		