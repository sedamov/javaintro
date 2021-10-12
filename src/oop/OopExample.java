package oop;

import oop.users.User;

public class OopExample {

    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.setUsername("johnSmith");
        firstUser.setAge(-13);
        System.out.println("Username is: " + firstUser.getUsername());
        System.out.println("Age is: " + firstUser.getAge());
    }
}
