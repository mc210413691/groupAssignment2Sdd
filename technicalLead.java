//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

import java.util.ArrayList;

public class technicalLead extends technicalEmployee {
    public ArrayList<softwareEngineer> team;


    public technicalLead(String name){

        super(name);
        this.baseSalary*=1.3;
        headcount=4;
        this.team=new ArrayList<softwareEngineer>();
    }

    public boolean hasHeadCount(){

        if(team.size()<headcount){
            return true;
        } else {
            return false;
        }
    }

    public boolean addReport(softwareEngineer e){

        if(hasHeadCount()){
            team.add(e);
            e.setManager(this);
            return true;
        } else {
            return false;
        }
    }

    public boolean approveCheckIn(softwareEngineer e){

        if(e.getManager().equals(this) && e.getCodeAccess()){
            return true;
        } else {
            return false;
        }
    }


    public boolean requestBonus(employee e, double bonus){

        businessLead businessLead= (businessLead)getAccountantSupport().getManager();
        if (businessLead.approveBonus(e, bonus)){
            return true;
        } else {
            return false;
        }
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
