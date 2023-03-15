package Assignment9_17;

import java.util.List;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1, 2, 3, 4, 5, 4, 6, 7, 3, 8, 9);
        /*takewhile will take the input till the condition is true , once the condition becomes false
        it will end the loop. */
        System.out.println("---takeWhile---");
        arrList.stream()
                .takeWhile(e -> e < 5)
                .forEach(System.out::println);
        /*drop while will start printing the data once the condition becomes false.*/
        System.out.println("---dropWhile---");
        arrList.stream()
                .dropWhile(e->e<5)
                .forEach(System.out::println);
    }
}
