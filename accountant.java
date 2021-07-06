//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public class accountant extends businessEmployee {
    private double bonusBudget;
    private technicalLead techLeaderSupported;
    private employee manager;
    public accountant(String name){
        super(name);
        bonusBudget = 0;
    }

    public technicalLead getTechLeaderSupported() {
        return techLeaderSupported;
    }

    public void supportTeam(technicalLead lead){
        this.techLeaderSupported = lead;
        for (int i=0; i < lead.getNumberOfDirectReports(); i++){
            if(lead.getNumberOfDirectReports() > 0){
                this.bonusBudget = bonusBudget + lead.getDirectReport()[i].getBaseSalary()*1.1;
            }
        }
    }

    public boolean approveBonus(double bonus){
        if(techLeaderSupported = null || bonus > bonusBudget){
            return false;
        }
        else {
            return true;
        }
    }

    public String employeeStatus(){
        String result;
        result = this.getEmployeeID() + " " +
                this.getName() + " with a budget of " + this.bonusBudget;
        if(techLeaderSupported != null){
            result = result + " and is supporting" +
                    techLeaderSupported.getName();
        }
        return result;
    }
}
