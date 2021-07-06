//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public abstract class technicalEmployee extends employee {
    int successfulCheckIns;

    public technicalEmployee(String name){
        super(name, 75000);
    }

    public String employeeStatus(){
        String result;
        result = super.employeeStatus();
        return result;
    }
}
