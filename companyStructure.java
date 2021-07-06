//Subject: ITVM5013 SOFTWARE DESIGN AND DEVELOPMENT
//Group 3 Member:
//1.CHAN YEE HONG
//2.KEVIN ZACHARY AL ANBIAH PAUL
//3.ABDUL HAKIM BIN ABDUL RASHID
//Course: MASTER OF INFORMATION TECHNOLOGY
//Group Assignment 2: Company Structure

//Here is my testing code that you can use to see if things are set up properly
public class companyStructure {
    public static void main (String[] args){
        technicalLead CTO = new technicalLead("Satya Nadella");
        softwareEngineer seA = new softwareEngineer("Kasey");
        softwareEngineer seB = new softwareEngineer("Breana");
        softwareEngineer seC = new softwareEngineer("Eric");

        CTO.addReport(seA);
        CTO.addReport(seB);
        CTO.addReport(seC);

        technicalLead VPofENG = new technicalLead("Bill Gates");
        softwareEngineer seD = new softwareEngineer("Winter");
        softwareEngineer seE = new softwareEngineer("Libby");
        softwareEngineer seF = new softwareEngineer("Gizan");
        softwareEngineer seG = new softwareEngineer("Zaynah");

        VPofENG.addReport(seD);
        VPofENG.addReport(seE);
        VPofENG.addReport(seF);
        VPofENG.addReport(seG);

        System.out.println(VPofENG.getTeamStatus());

        businessLead CFO = new businessLead("Amy Hood");

        accountant actA = new accountant("Nicky");

        accountant actB = new accountant("Andrew");

        CFO.addReport(actA, CTO);
        CFO.addReport(actB, VPofENG);

        System.out.println(CFO.getTeamStatus());
    }
}
