package lambdaExercise.unit3;

import lambdaExercise.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class AddingPredicate {

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
        Collections.sort(people, (o1, o2) -> o1.lastName.compareTo(o2.lastName));

        // Prints all elements of the list
        printConditionally(people, p -> true);

        System.out.println("**************************");
        // Print name of the people who's last name starts with 'C'
        printConditionally(people, p -> p.lastName.startsWith("C"));

        System.out.println("**************************");
        // Print name of the people who's first name starts with 'C'
        printConditionally(people, p -> p.firstName.startsWith("C"));
    }

    /**
     * java.util.function many functional interface
     * when there is a need of a method which returns boolean value
     * we can use test method of predicate functional interface
     *
     * @param people
     * @param predicate
     */
    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p))
                System.out.println(p);
        }
    }

}
