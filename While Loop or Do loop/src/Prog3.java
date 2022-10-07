// Application:	Prog 1
//Name: Ayden King
//GitHub User: Aydenkingg
//Date Sep 22 2022
//version 1.0
// Teacher: Brad Messner
import java.util.Scanner;
public class Prog3 {
	public static void main(String[] args) {
		{Scanner keyboard = new Scanner(System.in); 
		
		
		//Collect input from user
		System.out.println("What is your name");
		String name = keyboard.next();
		System.out.println("Pick a whole number between 1-100");
		int number = keyboard.nextInt();
		
		while (number > 0 && number < 100)
		{
			System.out.println("Thank you for your input, " + name);
			for (int COUNTDOWN = number; COUNTDOWN>0; COUNTDOWN--)
			{
			System.out.println("There is a remainder " + COUNTDOWN);
			}
			break;
			 }

		if(number < 0 || number > 100)
		{
			System.out.println("Enter a valid number please ");
		}
			int number2 = keyboard.nextInt();
			for(int COUNTDOWN2 = number2; COUNTDOWN2>0; COUNTDOWN2--)
			{
				System.out.println("There is a remainder of " + COUNTDOWN2);
			
			}

		}
	}
}

	

		


		
	
	
