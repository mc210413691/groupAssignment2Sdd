//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public class businessLead extends businessEmployee{
    private int headCount;
    private int directReports;
    private employee[] listOfDirectReports = new employee[10];
    public businessLead(String name){
        super(name);
        this.headCount = 10;
        setBaseSalary(2*super.getBaseSalary());
        this.directReports = 0;
    }

    public boolean hasHeadCount(){
        return this.directReports < this.headCount;
    }

    public boolean addReport(accountant e, technicalLead supportTeam){
        if(hasHeadCount()){
            listOfDirectReports[directReports] = e;
            directReports++;
            bonusBudget = bonusBudget + e.getBaseSalary()*1.1;
            supportTeam.setAccountant(e);
            e.supportTeam(supportTeam);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean requestBonus(employee e, double bonus){
        if(bonus <= bonusBudget){
            e.setBaseSalary(e.getBaseSalary() + bonus);
            bonusBudget -= bonus;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean approveBonus(employee e, double bonus) {
        boolean result = false;
        for (int i = 0; i < headCount; i++) {
            accountant myAccountant = (accountant) listOfDirectReports[i];
            if (e.getManager().equals(myAccountant.getTeamSupported())) {
                if (myAccountant.approveBonus(bonus)) {
                    return true;
                } else {
                    result = false;
                    return result;
                }
                else{
                    result = false;
                    return result;
                }
                return result;
            }
        }
    }

            public String getTeamStatus(){
                String result;
                result = employee() + " and is managing: " + "\n";
                for (int i=0; i < headCount; i++){
                    if (listOfDirectReports[i] != null){
                        result = result + listOfDirectReports[i].employeeStatus() + "\n";
                    }
                }
                return result;
            }

    }

