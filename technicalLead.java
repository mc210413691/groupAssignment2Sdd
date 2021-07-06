//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public class technicalLead extends technicalEmployee {
    private int headCount;
    private int numberOfDirectReports;
    private softwareEngineer[] listOfDirectReports = new softwareEngineer[4];
    private businessLead manager;
    private accountant supportingAccountant;

    public technicalLead(String name) {
        super(name);
        setBaseSalary(1.3 * getBaseSalary());
        headCount = 4;
        numberOfDirectReports = 0;
    }

    public boolean hasHeadCount() {
        if (numberOfDirectReports < headCount) {
            return true;
        } else {
        return false;
                }
    }

    public boolean addReport(softwareEngineer e) {
        if (hasHeadCount()) {
            listOfDirectReports[numberOfDirectReports] = e;
            numberOfDirectReports++;
            return true;
        } else {
            return false
        }
    }

    public boolean approveCheckIn(softwareEngineer e) {
        return e.getCodeAccess() && e.equals(listOfDirectReports);
    }

    public boolean requestBonus(employee e, double bonus) {
        if (manager.approveBonus(e, bonus)) {
            e.setBaseSalary(e.getBaseSalary() + bonus);
            return true;
        } else {
            return false;
        }

    }

    public String getTeamStatus() {
        String result;
        result = employeeStatus() + " and is managing: \n";
        if (numberOfDirectReports > 0) {
            for (int i = 0; i < headCount; i++) {
                if (listOfDirectReports[i] != null) {
                    result = result + listOfDirectReports[i].employeeStatus() + "\n";
                }
            }
            else{
                result = result + " and no direct reports yet";
            }
            return result;
        }
    }

        public accountant getAccountant () {
            return this.supportingAccountant;
        }

        public void setAccountant (accountant acc){
            this.supportingAccountant = acc;

        }

        public softwareEngineer[] getDirectReports () {
            return listOfDirectReports;
        }

        public int getNumberOfDirectReports () {
            return numberOfDirectReports;
        }

}
