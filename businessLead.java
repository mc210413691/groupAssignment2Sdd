//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

import java.util.ArrayList;

public class businessLead  extends businessEmployee{
    public ArrayList<accountant> team;

    public businessLead(String name){
        super(name);
        this.baseSalary=getBaseSalary()*2;
        this.headcount=10;
        this.team=new ArrayList<accountant>();
    }

    public boolean hasHeadCount(){
        if(this.team.size()<this.headcount){
            return true;
        } else {
            return false;
        }
    }

    public boolean addReport(accountant e, technicalLead supportTeam){
          if (hasHeadCount()){

            team.add(e);
            e.setManager(this);
            this.bonusBudget+=e.baseSalary*1.1;
            e.supportTeam(supportTeam);
            supportTeam.accountantSupport=e;
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(employee e, double bonus){
        if (bonus<=getBonusBudget()){
            this.bonusBudget-=bonus;
            e.bonusBudget+=bonus;
            return true;
        } else {
            return false;
        }
    }


    public boolean approveBonus(employee e, double bonus){

        for (int i=0;i<team.size();i++){
            if((team.get(i).getTeamSupported()).equals(e.manager) && team.get(i).canApproveBonus(bonus)) {
                e.bonus += bonus;
                team.get(i).bonusBudget -= bonus;
                return true;
            }
        }
        return  false;
    }

    public String getTeamStatus(){

        if (team.size()==0){
            return this.employeeStatus()+ " and no direct reports yet";
        } else {
            String teamStatus="";
            for (int i=0;i<team.size();i++){
                teamStatus+=("    "+team.get(i).employeeStatus()+"\n");
            }
            return this.employeeStatus()+" and is managing: \n"+teamStatus;

        }
    }
}
