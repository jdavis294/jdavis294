/*
 * Jalen Davis 
 * Lab time: Thursdays 5-6:40pm
 */
public class SoftwareEngineer extends Employee {

	public int getHours() {
		return super.getHours()+10;
	}
	
	public int getVacationDays() {
		return super.getVacationDays()-5;
	}
	
	public double getSalary() {
		return 55000.0;
	}
	
	public void writecode() {
		System.out.println("CODING!");
	}
}
