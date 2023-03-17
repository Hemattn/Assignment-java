package Multithreading2;

import java.util.Random;
import java.util.concurrent.*;

public class Question4RandomInteger {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                return random.nextInt(1000);
            }
        });

        Integer result = future.get();
        System.out.println(result);
        executorService.shutdown();
    }
}

//OUTPUT:
//Always a random number shows.