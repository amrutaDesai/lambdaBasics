package lambdaExercise.unit7;

import lambdaExercise.common.Person;

import java.util.Arrays;
import java.util.List;

/**
 * ForEach to iterate over collection in java 8
 * 1.Powerful
 * 2.Internal iterator
 * 3.This makes easy for processor to run in multiple threads - can run parallel using multicore systems
 *
 * Other for loops
 * 1. External iterator
 * 2. Sequential
 *
 */
public class CollectionForEachIterationExample {

    static List<Person> people = Arrays.asList(
            new Person("Carlos", "Denks"),
            new Person("Caramal", "Pinaki"),
            new Person("Gruuu", "Minions"),
            new Person("SuperMan", "Krepto"),
            new Person("AquamanMan", "Ceasor"),
            new Person("Hulk", "Christenson")
    );

    public static void main(String[] args) {

        // print all the list with usual for loop
        System.out.println("Printing with for loop");
        for (int i = 0; i < people.size(); i++)
            System.out.println(people.get(i));

        // print all the list with for in loop
        System.out.println("\n" +"Printing with for in loop");
        for (Person p : people)
            System.out.println(p);

        // print all the list with forEach java 8
        System.out.println("\n" +"Printing with forEach java 8 way");
        //people.forEach((p)-> System.out.println(p));
        people.forEach(System.out::println);
    }
}
