/*
 * Jalen Davis 
 * Lab time: Thursdays 5-6:40pm
 */
public class EmployeeClient {
	public static void main(String[]args) {
		
		Object Lawyer= new Lawyer();
		Object SoftwareEngineer = new SoftwareEngineer();
		Object HarvardLawyer= new HarvardLawyer();
		
		
		printEmployee(Lawyer);
		System.out.println();
		
		System.out.print("Harvard ");
		printEmployee(HarvardLawyer);
		
		System.out.println();
		code(SoftwareEngineer);
		
	}	


	public static void printEmployee(Object Lawyer ) {
		
		System.out.println("Lawyer: ");
		System.out.println("Salary: $" + ((Employee) Lawyer).getSalary());
		System.out.println("Hours: " + ((Employee)Lawyer).getHours());
		System.out.println("Vacation Days: " + ((Employee)Lawyer).getVacationDays());
		System.out.println("Vacation Form: " + ((Employee)Lawyer).getVacationForm());
		
	}
	public static void code(Object SoftwareEngineer) {
		
		System.out.println("Software Engineer: ");
		System.out.println("Salary: $" + ((Employee) SoftwareEngineer).getSalary());
		System.out.println("Hours: " + ((Employee)SoftwareEngineer).getHours());
		System.out.println("Vacation Days: " + ((Employee)SoftwareEngineer).getVacationDays());
		System.out.println("Vatacation Form: " + ((Employee)SoftwareEngineer).getVacationForm());
		
	}
}


