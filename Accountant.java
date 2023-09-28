package project2;
public class Accountant extends BusinessEmployee
{
	public TechnicalLead teamSupported;
	public Accountant(String name) 
	 {
		 super(name);
		 bonusBudget=0;
	 }
     public TechnicalLead getTeamSupported() 
     {
    	 return teamSupported;
     }
	 public void supportTeam(TechnicalLead lead) {
		 this.teamSupported = lead;
	     for (int i=0;i<lead.getTeam().size(); i++)
	     {
	    	 this.bonusBudget+=lead.getTeam().get(i).getBaseSalary()*1.1;
	     }
	 }
	 public boolean approveBonus(double bonus){
		 double requestedBonus=bonus;
	     if (requestedBonus<=getBonusBudget())
	     {
	    	 return true;
	     }
	     else{        
	    	 return false;
        }
	 }
	 public String employeeStatus() {
		 return super.employeeStatus() + " is supporting " + teamSupported.getName();
     }
        
}