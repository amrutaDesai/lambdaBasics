package lambdaExercise.unit5;

interface Process {
    void process(int i);
}
/**
 * Now that the b variable is used inside lambda expression, compiler freezes it to change
 * so it behaves like it's been declared final,
 * compiler check if we try to change a value of a variable in lambda { } it complains that
 * it is effectively final and cant be changed
 */
public class closureExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(a, i -> {
            // b=40; Error - variable defined should be final or effectively final
            System.out.println(i + b);
        });
    }
    private static void doProcess(int i, Process p) {
        p.process(i);
    }
}
