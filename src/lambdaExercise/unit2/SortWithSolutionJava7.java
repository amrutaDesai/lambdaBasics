package lambdaExercise.unit2;


/**
 * Exercise
 * 1. Print all people sorted with last name
 * 2. Print people name having first name starts with C
 * 3. Print people name having last name starts with C
 * <p>
 * with Java 7 this can be solved with anonymous classes
 */

import lambdaExercise.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortWithSolutionJava7 {
    static List<Person> people = Arrays.asList(
            new Person("Carlos", "Denks"),
            new Person("Caramal", "Pinaki"),
            new Person("Gruuu", "Minions"),
            new Person("SuperMan", "Krepto"),
            new Person("AquamanMan", "Ceasor"),
            new Person("Hulk", "Christenson")
    );

    public static void main(String[] args) {

        // sort the list on last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        });
        System.out.println(people);

        // Prints all elements of the list
        printAll(people);

        // Print name of the people who's last name starts with 'C'

/*
        // object has been passed
        // For new condition new method needs to be written
        printAllLastNameStartsWithC(people);

*/
        System.out.printf("%n");
        // Lets pass the behaviour
        printConditionally(people,new Condition(){
            @Override
            public boolean test(Person p) {
                return p.lastName.startsWith("C") ;
            }
        });

        System.out.printf("%n");
        // For another condition behaviour is same so the method
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.firstName.startsWith("C");
            }
        });

    }

    private static  void printConditionally(List<Person> People,Condition condition){
        for (Person p : people) {
            if(condition.test(p))
                System.out.printf(p.toString());
        }
    }

    private static void printAllLastNameStartsWithC(List<Person> people) {
        for (Person p : people) {
            if(p.lastName.startsWith("C"))
                System.out.printf(p.toString());
        }
    }

    public static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.printf(p.toString());
        }
    }
}

interface Condition{
    boolean test(Person p);
}
