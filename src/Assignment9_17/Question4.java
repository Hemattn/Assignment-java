package Assignment9_17;

import java.util.stream.IntStream;

public class Question4 {
    public static void main(String[] args) {
        //Iterators are basically used for memory optimisation,but works same as for loop.
        System.out.println("---Streams through iterators---");
        IntStream
                .iterate(15,i->i<=25, i->i+2)
                .forEach(System.out::println);
    }
}
