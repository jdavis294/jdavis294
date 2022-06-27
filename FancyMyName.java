package lab06;
import java.util.Scanner;
public class FancyMyName {
	
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your first and last name, seperated by space.");
	String fullname=scan.nextLine();
	int  a = fullname.indexOf(" ");
	int b = fullname.lastIndexOf("");
	 String first = fullname.substring(0,a);
	 String last = fullname.substring(a+1,b);
	
	 int length = first.length();
	 int length2= last.length();
	
	char firstinitial = first.charAt(0);
	 char lastinitial =last.charAt(0);
	 System.out.println("You entered the name: " +first+" " + last);
	 	System.out.println("Your first name is " + first +": has "+length+ " characters.");
		System.out.println("Your last name is "+ last+ ": has "+ length2+ " characters.");
		System.out.println();
		System.out.println("Your Initials are: " + firstinitial+lastinitial);
}
}
