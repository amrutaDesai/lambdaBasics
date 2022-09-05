package lambdaExercise.unit2;

import lambdaExercise.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWithSolutionJava8 {
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

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p))
                System.out.println(p);
        }
    }


}
