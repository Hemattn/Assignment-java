package Assignment9_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Question6 {
    public static  void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8);

        arrList.stream()
                .filter(e->e>7)
                .findAny()
                .stream()//it returns the optional value as a stream.
                .mapMulti((number,consumer)->IntStream.rangeClosed(1,10)
                        .forEach(e->consumer.accept(e*number)))
                        .forEach(System.out::println);

    }
}