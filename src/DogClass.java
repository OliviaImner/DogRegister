
public class DogClass {
	private String Name;
	private String Breed;  
	private int Age; 
	private double Weight; 
	private double TailLength;
	
	//setter for DogClass attributes
	public DogClass(String newName, String newBreed, int newAge, double newWeight) {
		Name = newName;
		Breed = newBreed;
		Age = newAge;
		Weight = newWeight;
	}
	
	//getter for DogClass Name attribute
	public String getName() {
		return Name;
	}
	
    //setter for tail length
	public void calculateTailLength(String Breed, int Age, double Weight){
		double length;
		if( Breed.equals("tax")) {
			length = 3.7; 
 	    } else { 
 	    	length = (Age * Weight) / 10; //for some reason this will not show any numbers < 1
 	    }
		this.TailLength = length;
	}
	
	//Print class variables to screen
	void printToScreen() {
		System.out.println(Name + "\t" + Breed + "\t" + Age + "\t" + Weight + "\t" + TailLength + "\n"); 
	}
	
}
