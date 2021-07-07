//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public class businessEmployee extends employee {


    public businessEmployee(String name){
        super(name,50000.00);
    }

    public double getBonusBudget(){
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    public String employeeStatus(){
        String s= String.format("%.2f",bonusBudget);
        return this.toString()+" with a budget of "+ s;
    }
}
