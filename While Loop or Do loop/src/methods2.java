import java.util.Scanner;
public class methods2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
	System.out.println("How many pumpkins do you have?");
	int pumpkins = keyboard.nextInt();
	
	pumpkins = pumpkins + growpumpkins();
	System.out.println(pumpkins);
	pumpkins = pumpkins - sellpumpkins(pumpkins);
	
	
	
	
	
	
		
	}

	
	public static int growpumpkins()
{
		Scanner keyboard = new Scanner(System.in);
System.out.print("How many pumpkins did you grow?" );
int newPumpkins = keyboard.nextInt();
return newPumpkins;
}
public static int sellpumpkins(int totalPumpkins)
{
	Scanner keyboard = new Scanner(System.in);
System.out.print("How many pumpkins did you sell?" );
int soldPumpkins = keyboard.nextInt();
if(soldPumpkins < totalPumpkins)
{
	return(totalPumpkins-soldPumpkins);
}
else
{
	System.out.print("We don't have that many." );
}
return soldPumpkins; 
}
}



