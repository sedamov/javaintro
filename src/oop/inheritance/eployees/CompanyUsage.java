package oop.inheritance.eployees;

public class CompanyUsage {

    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        Cleaner cleaner = new Cleaner();
        Manager manager = new Manager();
        ItCompany myStartup = new ItCompany();
        myStartup.hireEmployee(softwareEngineer);
        myStartup.hireEmployee(cleaner);
        myStartup.hireEmployee(manager);
    }
}
