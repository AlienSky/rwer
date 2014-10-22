package Homework5;

/**
 * Created by Alien on 22.10.2014.
 */
public class Person {
    private final String FirstName;
    private final String SecondName;
    private final String Email;

    @Override

    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", Email='" + Email + '\'' +
                ", age=" + age +
                ", post=" + post +
                '}';
    }

    private final int age;
    private final Position post;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!Email.equals(person.Email)) return false;
        if (!FirstName.equals(person.FirstName)) return false;
        if (!SecondName.equals(person.SecondName)) return false;
        if (post != person.post) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = FirstName.hashCode();
        result = 31 * result + SecondName.hashCode();
        result = 31 * result + Email.hashCode();
        result = 31 * result + age;
        result = 31 * result + post.hashCode();
        return result;
    }

    public Person(String email, String firstName, String secondName, int age, Position post) {
        this.Email = email;
        this.FirstName = firstName;
        this.SecondName = secondName;
        this.age = age;
        this.post = post;
    }
}
