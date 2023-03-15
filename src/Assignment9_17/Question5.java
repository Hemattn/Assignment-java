package Assignment9_17;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question5 {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //as the name suggests, if present it'll print the desired output or else
        // it'll print the other output.
        System.out.println("---ifPresentOrElse Example---");
        arrList.stream()
                .filter(e->e>7).findFirst()
                .ifPresentOrElse(System.out::println,
                        ()-> System.out.println("value does not exist"));

        System.out.println("---.or Example---");
        arrList.stream().filter(e->e>7)
                .findAny().or(()->Optional.of(-1)).ifPresentOrElse(System.out::println,
                        ()-> System.out.println("Value does not exist"));

        System.out.println("---orElseThrow Example---");
        arrList.stream()
                .filter(e->e>18)
                .findFirst()
                .orElseThrow();

    }
}
