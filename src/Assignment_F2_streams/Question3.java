package Assignment_F2_streams;
import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,4,8,2,10);
        //ist<Integer> numList = Arrays.asList(1, 6, 8, 2, 9, 3, 7);
        int sum = numbers.stream()
                .filter(num -> num > 5)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
