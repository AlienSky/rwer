package Homework5;

/**
 * Created by Alien on 22.10.2014.
 */
public class Main {
    public static void main(String[] str) {
        Person p1 = new PersonBuilder().setEmail("f@b").setFirstName("Petr").setSecondName("Petrov").setAge(34).setPost(Position.Manager).createPerson();
        Person p2 = new PersonBuilder().setEmail("f@b").setFirstName("Petr").setSecondName("Petrov").setAge(34).setPost(Position.Manager).createPerson();

        System.out.println("Comparison by equals()- "+ p1.equals(p2));
        System.out.println("Comparsion by HashCode "  + (p1 == p2));
        System.out.println("Person" + (p1) + "  Cравниваетса с " + (p2) );


    }
}