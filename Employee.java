package project2;
public abstract class Employee{
	private String name;
	public int employee_id;
	double baseSalary;
	Employee manager;
	public double bonus;
	public double bonusBudget;
	private static int idcount;
	public Accountant accountantSupport;
	
	
	public Employee(String name,double baseSalary)
	{
		this.name=name;
		this.baseSalary=baseSalary;
		idcount++;
		this.employee_id=idcount;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary=baseSalary;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager=manager;
	}
	public String getName() {
		return name;
	}
	public int getEmployeeID() {
		return employee_id;
	}
	public boolean equals1(Employee other)
	{
		if(this.getEmployeeID()==other.getEmployeeID())
			return true;
		else
			return false;
	}
	
	public String toString() {
		return getEmployeeID()+" "+getName();
	}
	public boolean equals(Employee obj) {
		return this.getEmployeeID()==obj.getEmployeeID();
	}
	public abstract String employeeStatus();
	public Accountant getAccountantSupport() {
		return accountantSupport;
	}
	
}