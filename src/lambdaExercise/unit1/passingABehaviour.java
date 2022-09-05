package lambdaExercise.unit1;

public class passingABehaviour {

    public static void main(String[] args) {
        printLength(s -> s.length() );
    }

    public static void printLength(StringLengthLambda l){
        System.out.println(l.getLength("Hello World!!"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}
