
public class Triangle {
	//a Triangle class that stores the 3 sides of a triangle
	private static int side1 ;
	private static int side2 ;
	private static int side3 ;
	
	
	//constructs a new Triangle with the given side1, side2 and side3
		public Triangle (int side1, int side2, int side3) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}

	
	// returns the fields' values
	public int getSide1(int side1) {
		return side1;
	}
	public int getSide2(int side2) {
		return side2;
	}
	public int getSide3(int side3) {
		return  side3;
	}
	// returns the string representation of the triangle 
	// such as {side1: 10, side2: 10, side3: 15
	
	public  String toString() {
		return "Triangle { side1: " + side1 +", side2: "+ side2 +", side3: "+side3 +"}" ;
	}

	public  boolean isEquilateral() {
		if(side1==side2 && side1==side3 ) {
			System.out.println("the triangle is equilateral");
	   }
	return true;
	}
	
	
	public  boolean  isScalene() {
		if(side1!=side2 && side1!=side3) {	
			System.out.println("the triangle is scalene");
		}
		return true;
	}
	
	
	public  boolean isIsoceles() {
		if (side1==side2 && side2!=side3) {
			System.out.println("The triangle is Isoceles");
		}
	return true;
	}

	
	
}
