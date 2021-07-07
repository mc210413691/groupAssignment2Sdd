//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

public class technicalEmployee extends employee {
    public int checkins;


    public technicalEmployee(String name){

        super(name,75000.00);
        checkins=0;
    }

    public String employeeStatus(){

        return super.toString()+" has "+checkins+" successful check ins";
    }

    public void setCheckin(){
        checkins++;
    }


}
