import java.util.Scanner;
import java.util.ArrayList;
//Olivia Imner olim9472

public class run {

	public static void main(String[] args) {
		
		//make primary register
		register registerMethods = new register();
		ArrayList<dog> dogRegister = registerMethods.makePrimaryRegister();
		registerMethods.printRegister( dogRegister );
		
		//load methods
		methods userMethods = new methods();
				
		//start program for user
		Scanner keyboard = new Scanner(System.in);
		String quit = "no";
		while(quit.equals("no")) {
			System.out.print("What do you want to do?\n\n" );
			System.out.print("Please type \"quit\", \"register\", \"list\" or, \"delete\".\n\n");
			String command = keyboard.nextLine();
				    
			if(command.equals("quit") || command.equals("register") || command.equals("list") || command.equals("delete")) {
				if(command.equals( "register" )) {
					//register method
					dogRegister = userMethods.registerCommmand(dogRegister);
					registerMethods.printRegister( dogRegister );
				} else if(command.equals("delete")) {
					//delete method
					dogRegister = userMethods.deleteCommmand(dogRegister);
					registerMethods.printRegister( dogRegister );
				} else if(command.equals("list")) {
					//list method
					userMethods.listCommand( dogRegister );
				} else {
					//exit
					System.out.print("\nGoodbye!");
					keyboard.close();
					quit = "yes";
				}
        
			} else {
				System.out.print("The command you entered is not valid. Please try again!\n");
			}
		}
	}
}
