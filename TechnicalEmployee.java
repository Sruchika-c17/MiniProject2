package project2;

public class TechnicalEmployee extends Employee {
    int checkIns;
    public TechnicalEmployee(String name) {
        super(name, 75000);
        this.checkIns = 0;
    }
	public int getCheckIns() {
		return checkIns;
	}
	public void setCheckIns(int checkIns) {
		checkIns++;
	}
	@Override
	public String employeeStatus() {
		 return getEmployeeID() + " " + getName() + " has "+checkIns +" successful check-ins";
	}
}