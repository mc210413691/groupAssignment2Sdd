//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public class softwareEngineer extends technicalEmployee {
    private boolean codeAccess;
    private technicalLead manager;
    public softwareEngineer(String name){
        super(name);
        codeAccess = false;
        successfulCheckIns = 0;
    }
    
    public boolean getCodeAccess(){
        return this.codeAccess;
    }
    
    public void setCodeAccess(boolean access){
        this.codeAccess = access;
    }
    
    public int getSuccessfulCheckIn(){
        return this.successfulCheckIns;
    }
    
    public boolean checkInCode(){
        if(manager.approveCheckIn(this)){
            this.successfulCheckIns++;
            return true;
        }
        else 
        {
            setCodeAccess(false);
            return false;
        }
    }
    
    public String employeeStatus(){
        String result = super.employeeStatus();
        result += " has " + getSuccessfulCheckIn() + " successful check ins.";
        return result;
    }
}
