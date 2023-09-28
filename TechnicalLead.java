package project2;
import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
	public int HeadCount;
	private ArrayList<SoftwareEngineer>team =new ArrayList<SoftwareEngineer>();
	public Accountant accountantSupport;
	public TechnicalLead(String name) {
        super(name);
        this.setBaseSalary(this.getBaseSalary()*1.3);
        this.HeadCount = 4;
    }
	public boolean hasHeadCount() {
		if (team.size()<this.HeadCount) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean addReport(SoftwareEngineer e) {
		if (hasHeadCount()) {
			team.add(e);
			e.setManager(this);
            return true;
        } 
    	else {
            return false;
		}
	}
	public boolean approveCheckIn(SoftwareEngineer e) {
		if((team.contains(e)) && (e.getCodeAccess())){
			this.setCheckIns(this.getCheckIns()+1);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean requestBonus(Employee e, double bonus) 
    {
        BusinessLead manager = (BusinessLead)getAccountantSupport().getManager();
        if (manager.requestBonus(e, bonus))
        	return true;
        else
        	return false;
    }
	public Accountant getAccountantSupport()
	 {
	        return accountantSupport;
    }
	public ArrayList<SoftwareEngineer> getTeam(){
	        return team;
	 }
	 public String getTeamStatus() 
	    {
		 if (team.size()==0)
    	 {
             return this.employeeStatus()+ " and no direct reports yet";
         } 
    	 else 
    	 {
             String teamStatus="";
             for (int i=0;i<team.size();i++)
             {
                 teamStatus+=(team.get(i).employeeStatus()+"\n");
             }
         return this.employeeStatus()+" and is managing: \n"+teamStatus;
         }
	    }
}