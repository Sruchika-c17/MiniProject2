package project2;
public class CompanyStructure
{
	public static void main(String[] args) 
	{
		TechnicalLead t1 = new TechnicalLead("Ram");
        SoftwareEngineer se1 = new SoftwareEngineer("John");
        SoftwareEngineer se2 = new SoftwareEngineer("Sam");
        SoftwareEngineer se3 = new SoftwareEngineer("Lily");
        t1.addReport(se1);
        t1.addReport(se2);
        t1.addReport(se3);
        se1.checkInCode();
        se3.checkInCode();
        se3.checkInCode();
        System.out.println("TL 1 status:\n"+t1.getTeamStatus());
        TechnicalLead t2 = new TechnicalLead("Sony");
        SoftwareEngineer se4 = new SoftwareEngineer("Harshi");
        SoftwareEngineer se5 = new SoftwareEngineer("Rithu");
        SoftwareEngineer se6 = new SoftwareEngineer("Moni");
        t2.addReport(se4);
        t2.addReport(se5);
        t2.addReport(se6);
        se4.checkInCode();
        se6.checkInCode();
        se6.checkInCode();
        se6.checkInCode();   
        System.out.println("TL 2 status:");
        System.out.println(t2.getTeamStatus());
        BusinessLead b1 = new BusinessLead("Jack");
        Accountant a1 = new Accountant("Jill");
        Accountant a2 = new Accountant("Mad");
        b1.addReport(a1,t1);
        b1.addReport(a2,t2);
        System.out.println("BusinessLead Team Status:");
        System.out.println(b1.getTeamStatus());
        System.out.println("Employee manager name:");
        System.out.println(se2.toString() + "'s manager is " + se2.getManager().toString());
        System.out.println(se6.toString() + "'s manager is " + se6.getManager().toString());
        System.out.println(a2.toString() + "'s manager is " + a2.getManager().toString());
        System.out.println();
        System.out.println("Testing BusinessLead approvedBonus method");
        System.out.print(se1.getManager() + " is asking for $10,000 bonus for "+se1.getName()+", (the Approval result should be TRUE): ");
        System.out.println(t1.requestBonus(se1, 10000));
        System.out.println("Updated budget is: \n"+se1.getManager().getAccountantSupport().getBonusBudget()+"\n");
        System.out.print(se6.getManager() + " is asking for $5,000 bonus for "+se6.getName() +", (the Approval result should be TRUE): ");
        System.out.println(t2.requestBonus(se6, 5000));
        System.out.println("Updated budget is: \n"+se6.getManager().getAccountantSupport().getBonusBudget()+"\n");
        System.out.print(se6.getManager() + " is asking for $400,000 bonus  for "+se6.getName()+", (the Approval result should be FALSE): ");
        System.out.println(t2.requestBonus(se6, 400000));
        System.out.println("Updated budget is: \n"+se6.getManager().getAccountantSupport().getBonusBudget()+"\n");
        System.out.println();
	}

}