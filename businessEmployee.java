//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public abstract class businessEmployee extends employee {

    double bonusBudget;

    public businessEmployee(String name){
        super(name,50000);

    }

    public double getBonusBudget() {
        double result = bonusBudget*100;
        result = Math.round(result);
        result /= 100;
        return bonusBudget;
    }

    public String employeeStatus(){
        String result = super.employeeStatus();
        result = result + " with a budget of " + this.getBonusBudget();
        return result;
    }
}
