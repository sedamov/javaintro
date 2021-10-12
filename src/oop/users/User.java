package oop.users;

public class User {

    private String username;
    private String password;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() < 4) {
            System.out.println("Invalid password.\n Length should be more than 4");
            this.password = null;
            return;
        }
        this.password = password;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 120) {
            System.out.println("Invalid age: " + age);
            return;
        }
        this.age = age;
    }

}
