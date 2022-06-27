import java.util.Scanner;

public class TriangleClient {

	 static int side1;
	 static int side2;
	 static int side3;
	
	
	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
	
			System.out.println("Input three sides for triangle");
			
				side1=scan.nextInt();
				side2=scan.nextInt();
				side3=scan.nextInt();
				
			 Triangle tri = new Triangle(side1, side2, side3);
			 	
			 System.out.println(tri.toString());
			 System.out.println();
			 
			tri.isEquilateral();
			tri.isScalene();
			tri.isIsoceles();
	}
	
	
	
}
