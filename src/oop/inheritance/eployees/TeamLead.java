package oop.inheritance.eployees;

/**
 * Describes Team Leaders
 */
public class TeamLead extends SoftwareEngineer {


    public void responsibility() {
        System.out.println("Responsible for teams' work.");
    }

    public void reviewCode() {
        System.out.println("Review juniors codes");
    }
}
