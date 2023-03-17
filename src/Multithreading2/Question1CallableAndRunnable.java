package Multithreading2;

import java.util.concurrent.*;

public class Question1CallableAndRunnable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        //Runnable doesn't return any object.
        Runnable runnable = () -> {
            System.out.println("This is runnable instance");
        };

        executor.execute(runnable);
        //Callable returns an object of integer type.
        Callable<Integer> callable = () -> {
            return 5;
        };

        Future<Integer> future = executor.submit(callable);
        int result = future.get();
        System.out.println("This is a callable class returning integer value= "+result);
    }

}

/*
OUTPUT:
This is runnable instance
This is a callable class returning integer value= 5
*/
