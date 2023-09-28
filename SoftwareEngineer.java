package project2;
public class SoftwareEngineer extends TechnicalEmployee{
	private boolean codeAccess;
    private int successfulCheckIns;
    public SoftwareEngineer(String name) {
        super(name);
        setCodeAccess(true);
        
    }
    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean access) {
        this.codeAccess = access;
    }
	
    public int getSuccessfulCheckIns() {
        return successfulCheckIns;
    }
    public void setCheckIns(int successfulCheckIns) {
    	this.successfulCheckIns=successfulCheckIns;
    }
    public boolean checkInCode()
    {
    	TechnicalLead manager=(TechnicalLead) this.getManager();
        if(manager.approveCheckIn(this))
        {
            this.checkIns++;
            return true;
        } 
        else 
        {
            codeAccess=false;
            return false;
        }
    }
}