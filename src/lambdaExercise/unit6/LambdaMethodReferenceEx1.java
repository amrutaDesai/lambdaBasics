package lambdaExercise.unit6;

/**
 * no argument for a method then such lambda method referencing can be used
 *
 * Just execute the method
 * Something without any parameter calling a method without parameter
 * () -> method()
 * () -> justPrint()
 * ClassName::methodName (lambda expression can be used)
 *
 * Parameter calling a method of that parameter
 * p -> method(p)
 * p -> System.out.println(p)
 * System.out::println
 *
 */
public class LambdaMethodReferenceEx1 {

    private static void justPrint() {
        System.out.println("Print Hellos!!!!");
    }

    public static void main(String[] args) {
       // Thread t = new Thread(() -> justPrint()); // () -> ()
       Thread t = new Thread(LambdaMethodReferenceEx1::justPrint); // () -> ()
       t.run();
    }

}
