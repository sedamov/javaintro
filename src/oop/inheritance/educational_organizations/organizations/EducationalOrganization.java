package oop.inheritance.educational_organizations.organizations;

import oop.inheritance.educational_organizations.employees.Employee;
import oop.inheritance.educational_organizations.employees.Teacher;
import oop.inheritance.educational_organizations.programs.Program;
import oop.inheritance.educational_organizations.rooms.Classroom;
import oop.inheritance.educational_organizations.students.Student;

import java.util.ArrayList;

public class EducationalOrganization {

    protected ArrayList<Student> students;
    protected ArrayList<Teacher> teachers;
    protected ArrayList<Employee> employees;
    protected ArrayList<Program> programs;
    protected ArrayList<Classroom> classrooms;

}
