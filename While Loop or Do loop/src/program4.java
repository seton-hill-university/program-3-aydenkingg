// Ayden King
//Mr. Messner
//10/6/2022
//Programming 4

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner keyboard = new Scanner (System.in) ;
// asks user for two numbers to store and use later
System.out.println( "Please enter your first number"):
");
int firstNumber = keyboard.nextInt () ;
System.out.println("Please enter your second number"):
");
int secondNumber
= keyboard. nextInt () ;
// after the numbers are stored, the options of what they can do with those numbers appears
displayMenu();
switch (keyboard.nextInt())
// gives the options to add, subtract, mult, divide and go back to the menu
case 1:
add (firstNumber, secondNumber);
break;
case 7.
subtract(firstNumber, secondNumber);
break;
case 3:
multiply(firstNumber, secondNumber):
break;
case 4:
divide(firstNumber, secondNumber):
break:
case 5:
displayMenu();
break:
}
7
I/ new method is made to show options and display a menu
© public static void displayMenu()
{
System.out.println ("Please select an option from the menu:
");
System.out.println("1.) Add\n2.) Subtract\n3.) Multiply\n4.) Divide\n5.) Exit");
}

I new method is made to show options and display a menu
7© public static void displayMenu()
8
{
9
0
System. out. println( "Please select an option from the men
System. out.println("1.) Add\n2.) Subtract\n3.) Multiply\

}
/1 new method is made to perform the adding on the entered integers
 public static int add (int firstNumber, int secondNumber)

{
int sum = firstNumber
+ secondNumber;
System.out.println("The sum is
+ sum) ;
return sum:
}
//new method is made to subtract the numbers
 public static int subtract (int firstNumber, int secondNumber)

{

int difference
=
firstNumber
secondNumber;
System.out.println("The difference is
U
return difference;
+ difference) ;
}

//new method is made for multiplying numbers
public static int multiply(int firstNumber, int secondNumber)

{

int product
firstNumber * secondNumber;
System.out. println("The product of the numbers is
return product;
i
+ product);

//new method is made for dividing numbers
 public static int divide (int firstNumber, int secondNumber)

{

int quotient = firstNumber/secondNumber;
System.out.println("The quotient of the numbers is
return quotient;

}
}
+ quotient);
}}