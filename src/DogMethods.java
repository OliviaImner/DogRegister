import java.util.Scanner;
import java.util.ArrayList;
//Olivia Imner olim9472

public class DogMethods {
	
	Scanner keyboard = new Scanner(System.in);

	//register methods
	ArrayList<DogClass> RegisterCommmand(ArrayList<DogClass> currentRegister) {
			
			System.out.print("Please enter the dog's name: ");
		    String Name = keyboard.nextLine();
		    
		    System.out.print("Please enter the dog's breed: ");
		    String Breed = keyboard.nextLine();
		    
		    System.out.print("Please enter the dog's age: " );
		    int Age = keyboard.nextInt();
		    keyboard.nextLine();
	
		    System.out.print("Please enter the dog's weight: " );
		    int Weight = keyboard.nextInt();
		    keyboard.nextLine();

			DogClass newDog = new DogClass(Name, Breed, Age, Weight);
			newDog.calculateTailLength(Breed, Age, Weight);
			
			//add the new dog to the register
			currentRegister.add(newDog);
		    return currentRegister;
		}
	
	//delete methods
	ArrayList<DogClass> DeleteCommmand(ArrayList<DogClass> currentRegister) {
		System.out.print("Please enter the name of the dog you want to delete from the register:\n");
	    String toDelete = keyboard.nextLine();
	    
		int size = currentRegister.size();
		// check if the register is empty
		if(size > 0) {
			//check if dog exists in current register
			String found = "no";
			loop1:
			for( int i=0; i < size; i++ ) {
				DogClass currentDog = currentRegister.get(i);
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
					DogClass currentDog = currentRegister.get(i);
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
	void ListCommand(ArrayList<DogClass> currentRegister) {
		System.out.print("Please enter a tail length: ");
		int userTailLength = keyboard.nextInt();
	    keyboard.nextLine();
	    
	    int size = currentRegister.size();
		for( int i=0; i < size; i++ ) {
			DogClass currentDog = currentRegister.get(i);
			double currentTailLength = currentDog.getTailLength();
			
			// print out the list of the longest tail lengths
			if(currentTailLength >= userTailLength) {
				currentDog.printToScreen();
			}
		}
	}
	
//keyboard.close();
}
