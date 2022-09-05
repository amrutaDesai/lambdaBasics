package lambdaExercise;

import lambdaExercise.common.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream always has source for eg. people.stream() so people is a source here
 * <p>
 * 3 different parts of teh stream
 * 1. source - people
 * 2. operation - filters etc....
 * 3. end operation :- which actually causes it to take some action on the stream forEach(p->sout(p))
 *
 *
 * Lambda expression allows parallel processing
 */
public class StreamExample1 {

    static List<Person> people = Arrays.asList(
            new Person("Carlos", "Denks"),
            new Person("Caramal", "Pinaki"),
            new Person("Gruuu", "Minions"),
            new Person("SuperMan", "Krepto"),
            new Person("AquamanMan", "Ceasor"),
            new Person("Hulk", "Christenson")
    );

    public static void main(String[] args) {
        people.stream()
                .filter(person -> person.lastName.startsWith("C"))
                .forEach(person -> System.out.println(person.firstName));


        // nothing happens here no iteration
        // it is just a view of the stream
        // unless we define some action and end action on stream there is nothing with stream
        Stream<Person> stream = people.stream();

        long count = people.stream()
                .filter(person -> person.lastName.startsWith("C"))// still nothing happens here as no terminal action
                .count(); // this completes stream by declaring end action

        System.out.println(count);


        people.parallelStream() // can returnk possibly parallel stream ,
                // if processor feels that this needs multiple CPU for the action to get done faster,
                // it returns parallel stream otherwise sequential stream can be returned
                .filter(person -> person.lastName.startsWith("C"))// still nothing happens here as no terminal action
                .count();    }
}
