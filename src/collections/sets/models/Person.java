package collections.sets.models;

public class Person {

    private String name;
    private String surname;
    private byte age;
    private String gender;
    private String favouriteMovie;
    private String favouriteSinger;

    private Address homeAddress;
    private Address workAddress;

    public Person(String name, String surname, byte age,
                  String gender, String favouriteMovie,
                  String favouriteSinger,
                  Address homeAddress, Address workAddress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.favouriteMovie = favouriteMovie;
        this.favouriteSinger = favouriteSinger;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    public void setFavouriteMovie(String favouriteMovie) {
        this.favouriteMovie = favouriteMovie;
    }

    public String getFavouriteSinger() {
        return favouriteSinger;
    }

    public void setFavouriteSinger(String favouriteSinger) {
        this.favouriteSinger = favouriteSinger;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;

        //Type conversion to Person
        Person person = (Person) obj;

        if (getAge() != person.getAge()) return false;
        if (!getName().equals(person.getName())) return false;
        if (!getSurname().equals(person.getSurname())) return false;
        if (!getGender().equals(person.getGender())) return false;
        if (!getFavouriteMovie().equals(person.getFavouriteMovie())) return false;
        if (!getFavouriteSinger().equals(person.getFavouriteSinger())) return false;
        if (!getHomeAddress().equals(person.getHomeAddress())) return false;
        if (!getWorkAddress().equals(person.getWorkAddress())) return false;
        return getWorkAddress().equals(person.getWorkAddress());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result *= 31 * result + getSurname().hashCode();
        result = 31 * result + (int) getAge();
        result = 31 * result + getGender().hashCode();
        result = 31 * result + getFavouriteMovie().hashCode();
        result = 31 * result + getFavouriteSinger().hashCode();
        result = 31 * result + getHomeAddress().hashCode();
        result = 31 * result + getWorkAddress().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", favouriteMovie='" + favouriteMovie + '\'' +
                ", favouriteSinger='" + favouriteSinger + '\'' +
                '}';
    }
}
