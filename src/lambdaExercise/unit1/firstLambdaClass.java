package lambdaExercise.unit1;


/**
 *  Advantage of Lambda
 *  1. Lambda --> functional programming
 *  2. Object-oriented programming to Functional programming
 *
 *  public void print(){
 *     System.out.println("Hello World!");
 *  }
 *
 * () -> System.out.println("Hello World!");
 *
 *
 * Lambda (functional interface) can have only one abstract method
 *
 *
 *
 */
public class firstLambdaClass {
    public static void main(String[] args) {
      lambda print =  (i) -> System.out.println("Hello World!");
      add addition = (a,b) -> a + b;
    }

    interface lambda{
        void print(int i);
    }

    interface add{
        int add(int a, int b);
    }
}
