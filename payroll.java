//Name: Jalen Davis
//Homework 5
//lab time: Thursdays 5:00
 import java.util.Scanner;
public class payroll {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type Employee's name");
		String name = scan.next();
		
		System.out.println("Type the number of hours you worked");
		int hours = scan.nextInt();
		
		System.out.println("What's your hourly rate of pay?");
		double payrate = scan.nextDouble();
		
		System.out.println("What's your federal tax rate?");
		int fedrate = scan.nextInt();
		
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours Worked: \t" + hours);
		System.out.println("Hourly Rate: \t" + payrate);
		System.out.println("Gross pay: \t" + (hours * payrate));
		System.out.println("Tax Deducted: \t" + fedrate);
		System.out.println("Net pay: \t" + ((hours*payrate)- fedrate));
		
		scan.close();
	}
}
