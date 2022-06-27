
public class Car implements Comparable <Car> {

	
	private String make;
	private String model;
	private int year;
	
	public Car(String make, String model, int year) {
		this.make= make;
		this.model= model;
		this.year= year;
	}
	
	public String getMake() {
		return make;		
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return make +", "+ model+ ", "+ year;
	}
	
	
	public int compareTo(Car other) {
		return toString().compareTo(other.toString());
		}
	
	}
