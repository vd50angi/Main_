package day1_hW;

import java.util.Scanner;
 /* Enter  the number of pizza bought : 10, the number of puffs bought: 12 and of cool drinks: 5
  * price of pizza = 100,
  * price of puffs = 20
  * price of cool drinks = 10 
  * sum the total price
  */
//note the output need to correct its not giving the right decimal places.not done
// need to ad decimal format to solve correct the output
public class Question2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double pizzaPrice = 100;
		double puffsPrice = 20;
		double coolDrinkPrice = 10;
		
		System.out.println("Enter the number of pizza's bought:" );
		int numOfPizza= input.nextInt();
		
		System.out.println(" Enter the number of puffs bought:");
		int numOfPuffs = input.nextInt();
		
		System.out.println("Enter the number of coolDrinks bought:");
		int numOfCoolDrinks = input.nextInt();
		
	
	 double totalCostPizza = (pizzaPrice * numOfPizza) ;
	 double totalCostPuffs	= (puffsPrice * numOfPuffs); 
	 double totalCostOfCoolDrinks = (coolDrinkPrice* numOfCoolDrinks);
	 System.out.println ("The total price: " + totalCostPizza + totalCostPuffs + totalCostOfCoolDrinks);
	 System.out.println("Enjoy the Show!!!!");
	
}
		
	
	
	 
	

}
