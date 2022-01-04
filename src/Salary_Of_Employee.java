class Department{
	int dept_id;
	String dept_name;
	String address;
	Department(){
		
	}
	Department(int dept_id,String dept_name,String address){
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.address = address;
		
	}
	void display_dept() {
		System.out.println("department id "+ dept_id);
		System.out.println("deartment name " + dept_name);
		System.out.println("address " +address);
		
	}
	
	
}
class Employee extends Department{
	int employee_id;
	String employee_name;
	double salary;
	Employee(){
		
	}
	
	Employee(int employee_id,String employee_name,double salary){
		super(201,"ece","Hyderabad");
		
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.salary = salary;
	}
		void calc() {
		double hra =30*salary/100;
		double da = 25*salary/100;
		 double pf =40*salary/100;
		 double it = 10*salary/100;
		double grosssalary1 =(salary+hra+da+pf+it);
		double netsalary1 =(salary+hra+da)-(pf+it);
		System.out.println("Salary of " +employee_name+ " is :"+salary);
		System.out.println("Gross Salary of "+employee_name+" is : " +grosssalary1);
		System.out.println("Net Salary of "+employee_name+" is : "+ (netsalary1));
		}
	}
	
	 
	
	

public class Salary_Of_Employee {

	public static void main(String[] args) {
		Employee em = new Employee(1,"Ravi",15000);
		em.display_dept();
		em.calc();
		
        
	}

}
