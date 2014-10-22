package Homework5;

public class PersonBuilder {
    private String email;
    private String firstName;
    private String secondName;
    private int age;
    private Position post;

    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setPost(Position post) {
        this.post = post;
        return this;
    }

    public Person createPerson() {
        return new Person(email, firstName, secondName, age, post);
    }
}