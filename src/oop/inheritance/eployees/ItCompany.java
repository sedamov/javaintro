package oop.inheritance.eployees;

import java.util.ArrayList;

public class ItCompany {

    private ArrayList<Employee> employees;
    private ArrayList<SoftwareEngineer> softwareEngineers;

    public void hireEmployee(Employee employee) {
        this.employees.add(employee);
    }

    //Boilerplate code
    public void hireSoftwareEngineer(SoftwareEngineer engineer) {
        this.softwareEngineers.add(engineer);
    }

    public void runTheCompany() {
        for (Employee employee: this.employees) {
            employee.work();
        }
    }

    public void paySalaries() {
        for (Employee employee: this.employees) {
            employee.getPaid();
        }
    }


    public void raiseSalary(Employee employee) {
        employee.raise();
    }

}
