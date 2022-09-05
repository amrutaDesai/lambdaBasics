package lambdaExercise.unit5;


/**
 * this :- refers to an instance of the callee or current class object
 * when used inside anonymous inner class :- "this" will be referred to the anonymous instance of
 * the inner class.
 * when used in lambda :- it does not refer to the lambda separately but to the outer context in which
 * lambda is used
 */
public class ThisReferenceWithinLambda {

    private static void doProcess(int i, Process p) {
        p.process(i);
    }

    private void thisReferenceOutsideOfMainMethod() {
        // No error here for "this" it will be referred to an instance from where it has been called.
        // i.e. instance of thisReferenceWithinLambda
        doProcess(20, i -> System.out.println(" Outside of main method "+this.toString()));
    }

    public static void main(String[] args) {
        int a = 10;
        ThisReferenceWithinLambda thisReferenceWithinLambda = new ThisReferenceWithinLambda();

        // this reference within anonymous inner class
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.printf(this.toString());
            }

            @Override
            public String toString() {
                return "This reference is within anonymous inner class ";
            }
        });

        // this reference within lambda
        doProcess(a, i -> {
            System.out.println("%n Within lambda");

            //System.out.println(this.toString());

            // Error :-  non-static can not be referred within static context
            // lambda takes the reference within which is has been declared
            // so if lambda written inside static main method then reference will be of static main method
        });

        // look for the lambda defined inside the outer method above
        thisReferenceWithinLambda.thisReferenceOutsideOfMainMethod();


    }

}
