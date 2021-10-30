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

    public EducationalOrganization() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.programs = new ArrayList<>();
        this.classrooms = new ArrayList<>();
    }

    public void hireEmployee(Employee employee) {
        if (employee instanceof Teacher) {
            this.teachers.add((Teacher) employee);
        } else {
            this.employees.add(employee);
        }
    }

    public void acceptStudent(Student student) {
        this.students.add(student);
    }

    public void repairRoom(Classroom classroom) {
        this.classrooms.add(classroom);
    }

    public void processProgram(Program program) {
        this.programs.add(program);
    }
}
