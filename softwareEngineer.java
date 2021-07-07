//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public class softwareEngineer extends technicalEmployee{
    public boolean CodeAccess;

    public softwareEngineer(String name){
        super(name);
        setCodeAccess(true);
    }

    public boolean getCodeAccess(){
        return CodeAccess;
    }

    public void setCodeAccess(boolean access){
        this.CodeAccess=access;
    }

    public int getSuccessfulCheckIns(){
        return checkins;
    }

    public boolean checkInCode(){
        technicalLead manager=(technicalLead) this.getManager();
        if (manager.approveCheckIn(this)){
            this.checkins++;
            return true;
        } else {
            CodeAccess=false;
            return false;
        }
    }
    public void setManger(technicalEmployee manager){

        super.manager=manager;
    }
}

