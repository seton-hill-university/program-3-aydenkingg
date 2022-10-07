

import java.util.Scanner;

public class MethodsProgram {

	public static void main(String[] args) {
		// Turn on scanner
		Scanner keyboard = new Scanner(System.in);
	//Ask for two numbers
		System.out.println("First number of your choosing?");
		int Number1 = keyboard.nextInt();
		System.out.println("Second number of your choosing?");
		int Number2 = keyboard.nextInt();
		
		//Use the two numbers to make equations
		
		displayMenu();
		switch (keyboard.nextInt()) {
		case 1:
		 multiply( Number1, Number2);
		 break;
		case 2:
			divide(Number1, Number2);
			break;
		case 3:
			add(Number1, Number2);
		    break;
		case 4:
			subtract(Number1, Number2);
			break;
		case 5:
		displayMenu();
		break;
		}
				
	}


		//Menu
		
		public static void displayMenu()
		{
			System.out.println("Choose an option from the Menu");
			System.out.println("1. Multiply\n 2. Divide\n 3. Add\n 4. Subtract\n");
		}
		public static int multiply(int Number1, int Number2)
		//Multiplying, dividing, adding, and subtracting methods
		{
			int product = Number1 * Number2;
			System.out.println("Your product is " + product);
			return product;
		}
		 public static int divide(int Number1, int Number2)
		 {
			 int quotient = Number1/Number2;
			 System.out.println("Your quotient is " + quotient);
			 return quotient;
		 }
		 
			 public static int add(int Number1, int Number2)
			 {
				 int sum = Number1 + Number2;
				 System.out.println("Your sum is " + sum);
				 return sum;
			 }
			public static int subtract(int Number1, int Number2)
			{
				int difference = Number1 - Number2;
				System.out.println("Your difference is" + difference);
				return difference;
			}
			
			 
			 
			 
			 
			 
			 
			 
			 
			 }



