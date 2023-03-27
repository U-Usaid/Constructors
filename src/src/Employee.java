package src;

public class Employee {

	String name;
	String jobTitle;
	double empSalary;
	
	
	Employee(String empName, String empJob, double salary){
		this.name = empName;
		this.jobTitle = empJob;
		this.empSalary = salary;
		
	}
	
	
	public String getEmpName() {
		return name;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public double getEmpSalary () {
		if (empSalary < 800) {
			System.out.println("Faqeer");
		}
		return empSalary;
	}
}
