package lambdaExercise.unit1;

/**
 *
 * when an Interface is annotated with @FunctionalInterface
 * No one should add 2nd method to it.
 * Because consumers of the interface will throw a compiled time error.
 * So, it is just to convey info that this is a functional interface,the annotation is used.
 * The annotation is not compulsory but by adding annotation if someone adds another method to it,
 * a compiled time error will be showed on the interface itself.
 *
 */
@FunctionalInterface
public interface Greeting {
    public void greeting();
}
