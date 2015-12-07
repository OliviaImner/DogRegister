import java.text.DecimalFormat;

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
	
	DecimalFormat sum = new DecimalFormat("0.###");
	
	 //setter for tail length
	public void calculateTailLength(String Breed, int Age, double Weight){
		double length;
		if( Breed.equals("tax")) {
			length = 3.7; 
	    } else { 
 	    	length = (Age * Weight) / 10;
 	    }
		this.TailLength = length;
	}
	
	//getter for DogClass Name attribute
	public String getName() {
		return Name;
	}
	
	//getter for DogClass TailLength attribute
	public double getTailLength() {
		return TailLength;
	}
	
	//Print class variables to screen
	void printToScreen() {
		System.out.print(Name + "\t" + Breed + "\t" + Age + "\t" + Weight + "\t" +  sum.format(TailLength) + "\n"); 
	}
	
}
