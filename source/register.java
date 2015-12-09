import java.util.ArrayList;
//Olivia Imner olim9472

public class register {
	
	//initial values
	String[] nameArray = {"Fido", "Mary", "John", "Ginger", "Jake"};
	String[] breedArray = {"tax", "pitbull", "mastif", "bulldog", "colie"};
	int[] ageArray = {1,2,3,4,5};
	double[] weightArray = {10.1, 20.1, 30.1, 40.1, 50.1};
		
		
	//make primary register
	public ArrayList<dog> makePrimaryRegister() {
		//declare the arraylist
		ArrayList<dog> dogArrayList = new ArrayList<dog>();
		
		//Create dog objects, and place in array list 
		for( int i=0; i<5; i++ ) {
			
			//give the attributes of currentDog the values of nameArray[i] etc.
			dog currentDog = new dog(nameArray[i], breedArray[i], ageArray[i], weightArray[i]);
			currentDog.calculateTailLength(breedArray[i], ageArray[i], weightArray[i]);
			
			//add object to array list
			dogArrayList.add(currentDog);
		}
		return dogArrayList;
	}
		
	//print the objects in the current register
	public void printRegister(ArrayList<dog> currentRegister) {
		int size = currentRegister.size();
		System.out.print("The register currently includes:\n" );
		System.out.print("Name\tBreed\tAge\tWeight\tTail Length\n");
		for( int i=0; i < size; i++ ) {
			dog currentDog = currentRegister.get(i);
			currentDog.printToScreen();
		}
	}
	
}
