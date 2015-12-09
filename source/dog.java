import java.text.DecimalFormat;
//Olivia Imner olim9472

public class dog {
	
	// define the attributes 
	private String name;
	private String breed;
	private int age;
	private double weight;
	private double tailLength;
	
	//set dog attributes
	public dog(String newName, String newBreed, int newAge, double newWeight) {
		name = newName;
		breed = newBreed;
		age = newAge;
		weight = newWeight;
	}
	
  //set tail length
	public void calculateTailLength(String breed, int age, double weight){
		double length;
		if( breed.equals("tax")) {
			length = 3.7; 
		} else {
			length = (age * weight) / 10;
		}
		this.tailLength = length;
	}
	
	//get name attribute
	public String getName() {
		return name;
	}
	
	//get tailLength attribute
	public double getTailLength() {
		return tailLength;
	}
	
	//print class attributes to screen (writes out tailLength with two decimals)
	void printToScreen() {
		DecimalFormat sum = new DecimalFormat("0.##");
		System.out.print(name + "\t" + breed + "\t" + age + "\t" + weight + "\t" +  sum.format(tailLength) + "\n");
	}
	
}
