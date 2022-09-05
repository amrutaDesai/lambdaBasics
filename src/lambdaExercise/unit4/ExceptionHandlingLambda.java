package lambdaExercise.unit4;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

    public static void main(String[] args) {
        int[] someIntegers = {1, 2, 3, 4, 5};
        int key = 2;
        process(someIntegers, key, (v, k) -> System.out.println(v + k));

        int key1 = 0;
        process(someIntegers, key1, (v1, k1) -> {
            try {
                System.out.println(v1 / k1);
            } catch (ArithmeticException e) {
                System.out.printf("An arithmeticException has occurred");
            }
        });
    }


    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumbers) {
            biConsumer.accept(i, key);
        }
    }
}
