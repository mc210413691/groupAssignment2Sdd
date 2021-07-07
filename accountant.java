//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public class accountant extends businessEmployee {
    public technicalLead teamSupported;

    public accountant(String name){
        super(name);
        bonusBudget=0;
    }

    public technicalLead getTeamSupported(){
        return teamSupported;
    }

    public void supportTeam(technicalLead lead){
        this.teamSupported=lead;
        for (int i=0; i<lead.team.size(); i++){
            this.bonusBudget+=lead.team.get(i).getBaseSalary()*1.1;
        }
    }

    public boolean canApproveBonus(double bonus){
        double requestedBonus=bonus;
        if (requestedBonus<=getBonusBudget()){
            return true;
        } else {
            System.out.print(" Rejected because Budget not sufficient. ");
            return false;
        }

    }

    public String employeeStatus(){
        return this.toString()+" with a budget of "+ getBonusBudget()+" is supporting "+ this.getTeamSupported();
    }



}
