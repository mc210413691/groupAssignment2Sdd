//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure


public abstract class employee {
private String name;
private double baseSalary;
private static int ID;
private int employeeID;
private employee getmanager;
private int length;
private boolean manager;

    public Employee(String name, double baseSalary){
    ID++;
    this.name = name;
    this.baseSalary = baseSalary;
    this.employeeID = ID;
 }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double base){
    this.baseSalary = base;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public boolean equals(employee other){
    boolean result = false;
    for (int i = 0; i<=other.length; i++){
        if (this.employeeID == other(0).employeeID){
            return true;
        }
        else
        {
            result = false;
        }

        public String toString(){
            return employeeID + " " + name;
        }

        public String employeeStatus(){

        }
        public employee getManager(){
            return manager;
        }
    }
    }
    
    //related problem with technicalEmployee.java
    protected abstract String employeeStatus();
}
