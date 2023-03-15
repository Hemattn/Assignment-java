package Assignment9_17;

import java.util.stream.IntStream;

public class Question3 {
    public static void main(String[] args) {
        //It will start from 1 , but will not include the last value
        System.out.println("---normal ranged---");
        IntStream.range(1,4)
                .forEach(System.out::println);
        //It will include both the values defined in the range.
        System.out.println("---Closed Ranged---");
        IntStream.rangeClosed(1,4)
                .forEach(System.out::println);
    }
}
