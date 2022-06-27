/*
 * Jalen Davis 
 * Lab time: Thursdays 5-6:40pm
 */
public class HarvardLawyer extends Lawyer {
	
	
	public double getSalary() {
		double HarvardLawyerSalary = super.getSalary() + super.getSalary()*0.20;
		return HarvardLawyerSalary ;
	}
	
	public int getVacationDays() {
		return super.getVacationDays()+3;
	}
	
	public String getVacationForm(){
		return  super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
		}

}
