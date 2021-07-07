//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure


public abstract class employee {
    private static int countID;

    public String name;
    public int employeeID;
    public double baseSalary;
    public double bonus;

    public employee manager;
    public accountant accountantSupport;
    public int headcount=0;

    public double bonusBudget;


    public employee(String name, double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
        countID++;
        this.employeeID=countID;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    public String getName(){
        return this.name;
    }

    public int getEmployeeID(){
        return this.employeeID;
    }

    public employee getManager(){
        return manager;
    }

    public accountant getAccountantSupport() {
        return accountantSupport;
    }

    public void setManager(employee manager){
        this.manager=manager;
    }

    public boolean equals(employee other){
        return this.getEmployeeID()==other.getEmployeeID();
    }

    public String toString(){
        return getEmployeeID()+" "+getName();
    }

    public abstract String employeeStatus();

    public void getBonus(){

    }

}
