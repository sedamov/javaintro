package oop.inheritance.educational_organizations;

import oop.inheritance.educational_organizations.employees.Accountant;
import oop.inheritance.educational_organizations.organizations.NgEducationalOrg;
import oop.inheritance.educational_organizations.students.Student;

public class EducationOrgExample {

    public static void main(String[] args) {
        NgEducationalOrg ngEducationalOrg = new NgEducationalOrg();
        Accountant accountant = new Accountant();
        ngEducationalOrg.hireEmployee(accountant);

        Student student = new Student();
        ngEducationalOrg.acceptStudent(student);
    }
}
