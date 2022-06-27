//Jalen Davis 
//homework 8
//Problem 4
import java.util.Scanner;
public class GradeBookKeeper {
public static void main(String[]args) {
	
	Scanner scan= new Scanner(System.in);
	String gradex="Enter the grade for student ";
	System.out.println("Enter the number of students:");
	
	int numstudents= scan.nextInt();
	int[]students= new int [numstudents];
	double sum=0;
	double average =0;
	int max=students[0];
	int min=students[0];
	
	
	for(int x=0;x<students.length;x++) {	
		System.out.println(gradex + (x+1) + ":");
		students[x]=scan.nextInt();
	}
	
	for(int x=0; x<students.length ;x++) {	
		sum = sum+students[x];
		average=  sum/students.length;
	}
	
	System.out.println("The average is: "+ average);
	
	for(int x=0;x<students.length;x++) {
	if(students[x] >max)max =students[x];
	if (students[x]<max)min= students[x];	
	}
	
	System.out.println("The maximum number is: "+ max);
	System.out.println("The minimum number is: "+ min);

	}
}