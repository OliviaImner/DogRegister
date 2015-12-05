import java.util.Scanner;
import java.util.ArrayList;

public class DogMethods {
	Scanner Keyboard = new Scanner(System.in);

	//register methods
	ArrayList<DogClass> RegisterCommmand(ArrayList<DogClass> currentRegister) {
			
			System.out.print("Please enter name: ");
		    String Name = Keyboard.nextLine();
		    
		    System.out.print("Please enter breed: ");
		    String Breed = Keyboard.nextLine();
		    
		    System.out.print("Please enter age: " );
		    int Age = Keyboard.nextInt();
		    Keyboard.nextLine();
	
		    System.out.print("Please enter weight: " );
		    int Weight = Keyboard.nextInt();
		    Keyboard.nextLine();
			//Keyboard.close(); //closing standard in here results in an error since its still needed in "main"

			DogClass newDog = new DogClass(Name, Breed, Age, Weight);
			newDog.calculateTailLength(Breed, Age, Weight);
			currentRegister.add(newDog);

		    return currentRegister;
		}
	
	//delete methods
	ArrayList<DogClass> DeleteCommmand(ArrayList<DogClass> currentRegister) {
		System.out.print("Please enter the name of the dog you want to delete from the register: ");
	    String toDelete = Keyboard.nextLine();
	    
		int size = currentRegister.size();
		loop:
		for( int i=0; i < size; i++ ) {
			DogClass currentDog = currentRegister.get(i);
			String dogName = currentDog.getName();
			if(dogName.equals(toDelete)){
				currentRegister.remove(i);
				break;
			}
		}
		return currentRegister;
	}
	
	//list method
	void ListCommand(ArrayList<DogClass> currentRegister) {
		System.out.print("Please enter a tail length: ");
		int userTailLength = Keyboard.nextInt();
	    Keyboard.nextLine();
	    
	    int size = currentRegister.size();
		for( int i=0; i < size; i++ ) {
			DogClass currentDog = currentRegister.get(i);
			double currentTailLength = currentDog.getTailLength();
			
			if(currentTailLength >= userTailLength) {
				currentDog.printToScreen();
			}
		}
	}

}
