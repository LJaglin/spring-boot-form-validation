package pl.ljaglin.springbootformvalidation.models;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge() {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Person: " + this.firstName + " " + this.lastName + " is " + this.age;
    }

}
