import java.util.Scanner;
import java.util.ArrayList;
//Olivia Imner olim9472

public class methods {
	
	Scanner keyboard = new Scanner(System.in);

	//register methods
	ArrayList<dog> registerCommmand(ArrayList<dog> currentRegister) {
			
			System.out.print("Please enter the dog's name: ");
      String name = keyboard.nextLine();
		    
      System.out.print("Please enter the dog's breed: ");
      String breed = keyboard.nextLine();
		    
      System.out.print("Please enter the dog's age: " );
      int age = keyboard.nextInt();
      keyboard.nextLine();
	
      System.out.print("Please enter the dog's weight: " );
      int weight = keyboard.nextInt();
      keyboard.nextLine();

			dog newDog = new dog(name, breed, age, weight);
			newDog.calculateTailLength(breed, age, weight);
			
			//add the new dog to the register
			currentRegister.add(newDog);
		    return currentRegister;
		}
	
	//delete methods
	ArrayList<dog> deleteCommmand(ArrayList<dog> currentRegister) {
		System.out.print("Please enter the name of the dog you want to delete from the register:\n");
    String toDelete = keyboard.nextLine();
	    
		int size = currentRegister.size();
		// check if the register is empty
		if(size > 0) {
			//check if dog exists in current register
			String found = "no";
			loop1:
			for( int i=0; i < size; i++ ) {
				dog currentDog = currentRegister.get(i);
				String dogName = currentDog.getName();
				if(dogName.equals(toDelete)) {
					found = "yes";
					break loop1;
				}
			}
			//if the dog was found delete the dog
			if(found.equals("yes")) {
				loop2:
				for( int i=0; i < size; i++ ) {
					dog currentDog = currentRegister.get(i);
					String dogName = currentDog.getName();
					if(dogName.equals(toDelete)){
						//remove the dog from the register
						currentRegister.remove(i);
						break loop2;
					} 
				}
			} else { //if the dog isn't found
				System.out.print("The dog you want to delete could not be found!\n\n");
			}
		} else { // if the register is empty
			System.out.print("The register is currently empty and, therefore, you cannot delete any entries\n\n");
		}
		
		return currentRegister;
	}
	
	//list method
	void listCommand(ArrayList<dog> currentRegister) {
		System.out.print("Please enter a tail length: ");
		int userTailLength = keyboard.nextInt();
    keyboard.nextLine();
	    
    int size = currentRegister.size();
		for( int i=0; i < size; i++ ) {
			dog currentDog = currentRegister.get(i);
			double currentTailLength = currentDog.getTailLength();
			
			// print out the list of the longest tail lengths
			if(currentTailLength >= userTailLength) {
				currentDog.printToScreen();
			}
		}
	}
	
//keyboard.close();
}
