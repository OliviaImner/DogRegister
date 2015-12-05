import java.util.ArrayList;

public class DogRegister {
	//initial values
		String[] NameArray = {"Fido", "Mary", "John", "Ginger", "Jake"};
		String[] BreedArray = {"tax", "doberman", "mastif", "rottweiler", "colie"};
		int[] AgeArray = {1,2,3,4,5};
		double[] WeightArray = {10.1, 20.1, 30.1, 40.1, 50.1};
		double[] TailLengthArray = {1.1, 2.1, 3.1, 4.1, 5.1};
		
		//make primary register
		public ArrayList<DogClass> makePrimaryRegister() {
				
			ArrayList<DogClass> DogArrayList = new ArrayList<DogClass>();
				
			for( int i=0; i<5; i++ ) {
				DogClass currentDog = new DogClass(NameArray[i], BreedArray[i], AgeArray[i], WeightArray[i]);
				currentDog.calculateTailLength(BreedArray[i], AgeArray[i], WeightArray[i]);
				DogArrayList.add(currentDog);
			}
			return DogArrayList;
		}
		
		//print the objects in the current register
		public void printRegister(ArrayList<DogClass> currentRegister) {
			int size = currentRegister.size();
			System.out.print("The register currently includes:\n" );
		    System.out.print("Name\tBreed\tAge\tWeight\tTail Length\n");
			for( int i=0; i < size; i++ ) {
				DogClass currentDog = currentRegister.get(i);
				currentDog.printToScreen();
			}
		}

}
