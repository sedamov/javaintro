package oop.animals;

public class Animal {

    private String name;
    private int age;
    private String gender;
    private boolean hasFur;
    private boolean hasTail;


    public Animal(String name, int age, String gender, boolean hasFur, boolean hasTail) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hasFur = hasFur;
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
