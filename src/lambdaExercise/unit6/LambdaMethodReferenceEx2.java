package lambdaExercise.unit6;

import lambdaExercise.common.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * method takes one argument
 * Consumer is takes an input argument
 *
 * Parameter calling a method of that parameter
 * p -> method(p)
 * p -> System.out.println(p)
 * System.out::println
 */

public class LambdaMethodReferenceEx2 {
    static List<Person> people = Arrays.asList(
            new Person("Carlos", "Denks"),
            new Person("Caramal", "Pinaki"),
            new Person("Gruuu", "Minions"),
            new Person("SuperMan", "Krepto"),
            new Person("AquamanMan", "Ceasor"),
            new Person("Hulk", "Christenson")
    );

    public static void main(String[] args) {

        // Prints all elements of the list
        printConditionally(people, p -> true, System.out::println); // p -> method(p)

    }


    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p))
                consumer.accept(p);
        }
    }

}

