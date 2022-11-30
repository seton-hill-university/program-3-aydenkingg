//Ayden King
//Programming 4
// Version 2.0
import java.util.Scanner;	

public class prog4 {
	public static void main1(String [] args) {

	

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		int firstNumber = keyboard.nextInt ();
		System. out.println("Please enter your second number");
		int secondNumber = keyboard. nextInt () ;
		
		displayMenu();
		switch (keyboard.nextInt())
		{
			
	case 1:
		add1 (firstNumber, secondNumber);
		break;
	case 2:
		subtract(firstNumber, secondNumber);
		break;
	case 3:
		multiply(firstNumber, secondNumber);
		break;
	case 4:
		divide(firstNumber, secondNumber);
		break;
	case 5:
		displayMenu();
		break;
		}
	}
		public static void main(String[] args) {
		}
			
			
			public static void divide(int firstNumber, int secondNumber) {
			// TODO Auto-generated method stub
			
		}


			public static void multiply(int firstNumber, int secondNumber) {
			// TODO Auto-generated method stub
			
		}


			public static void subtract1(int firstNumber, int secondNumber) {
			// TODO Auto-generated method stub
			
		}


			public static void add1(int firstNumber, int secondNumber) {
			// TODO Auto-generated method stub
			

			
		public static void displayMenu()
		{
			System.out.println("Please type which option you'd like to use from the menu: ");
			System.out.println("1). Add\n2.) Subtract\n3.) Multiply\n4.) Divide\n5.) Exit");
		}
		
	public static int add(int firstNumber, int secondNumber)
	{
		int sum = firstNumber + secondNumber;
		System.out.println("The sum is " + sum);
		return sum;
	}
	
	public static int subtract(int firstNumber, int secondNumber)
	{
		int difference = firstNumber - secondNumber;
		System.out.println("The difference is " + difference);
		return difference;
	}
		public static int multiply1(int firstNumber, int secondNumber)
		{
			int product = firstNumber * secondNumber;
			System.out.println("The product of the numbers is " + product);
			return product;
		}
		public static int divide1(int firstNumber, int secondNumber)
		{
			int quotient = firstNumber/secondNumber;
			System.out.println("The quotient is " + quotient);
			return quotient;
		}
		

		
		
		
		
		
}

	// TODO Auto-generated method stub
