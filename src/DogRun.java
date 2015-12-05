import java.util.Scanner;
import java.util.ArrayList;

public class DogRun {

	public static void main(String[] args) {
		//make primary register
		DogRegister makeRegister = new DogRegister();
		ArrayList<DogClass> myRegister = makeRegister.makePrimaryRegister();
		makeRegister.printRegister( myRegister );
				
		//load methods
		DogMethods myMethods = new DogMethods();
				
		Scanner keyboard = new Scanner(System.in);
		String quit = "no";
		while(quit.equals("no")) {
			System.out.print("What do you want to do?\n\n" );
			System.out.print("Please type \"quit\", \"register\", \"list\" or, \"delete\"\n\n");
		    String Command = keyboard.nextLine();
				    
		    if(Command.equals("quit") || Command.equals("register") || Command.equals("list") || Command.equals("delete")) {
		    	if(Command.equals( "register" )) {
		    		//register method
		    		myRegister = myMethods.RegisterCommmand(myRegister);
		    		makeRegister.printRegister( myRegister );
		    	} else if(Command.equals("delete")) {
			   		//delete method
		    		myRegister = myMethods.DeleteCommmand(myRegister);
		    		makeRegister.printRegister( myRegister );
		    	} else if(Command.equals("list")) {
		    		//list method
		    	} else {
		    		//exit
		    		System.out.print("\nGoodbye!");
					quit = "yes";
		    	}
		    } else {
		    	System.out.print("The command you entered is not valid. Please try again!\n");
		    }
		}
	}
}
