package lambdaExercise.unit4;

import java.util.function.BiConsumer;

/**
 * Instead of keeping try catch block with lambda where we could have lot many
 *
 * Separate the logic in wrapper method to handle exception and return  on the behavior
 * there could be many more effective ways to handle the exceptions in lambda this is one of the good way
 */

public class WrapperLambda {

    public static void main(String[] args) {
        int[] someIntegers = {1, 2, 3, 4, 5};
       /* int key = 2;
        process(someIntegers, key, (v, k) -> System.out.println(v + k));
*/
        int key1 = 0;
        process(someIntegers, key1,wrapperLambda((v1, k1) -> System.out.println(v1 / k1)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumbers) {
            biConsumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer){
       return (v1, k1) -> {
            try {
                biConsumer.accept(v1 ,k1);
            } catch (ArithmeticException e) {
                System.out.printf("An arithmeticException has occurred in wrapper class %n");
            }
        };
    }
}
