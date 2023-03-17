package Multithreading2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        List<Runnable> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int taskId = i + 1;
            tasks.add(() -> {
                System.out.println("Task #" + taskId + " is running...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Task #" + taskId + " has been interrupted.");
                }
                System.out.println("Task #" + taskId + " has completed.");
            });
        }

        runTasksWithSingleThreadExecutor(tasks);
        runTasksWithNewCachedThreadPool(tasks);
        runTasksWithNewFixedThreadPool(tasks, 3);
    }

    private static void runTasksWithSingleThreadExecutor(List<Runnable> tasks) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (Runnable task : tasks) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All tasks have completed with SingleThreadExecutor.");
    }

    private static void runTasksWithNewCachedThreadPool(List<Runnable> tasks) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (Runnable task : tasks) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All tasks have completed with newCachedThreadPool.");
    }

    private static void runTasksWithNewFixedThreadPool(List<Runnable> tasks, int poolSize) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(poolSize);

        for (Runnable task : tasks) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All tasks have completed with newFixedThreadPool.");
    }
}

/*OUTPUT:
Task #1 is running...
Task #1 has completed.
Task #2 is running...
Task #2 has completed.
Task #3 is running...
All tasks have completed with SingleThreadExecutor.
Task #1 is running...
Task #2 is running...
Task #3 is running...
Task #4 is running...
Task #5 is running...
Task #6 is running...
Task #7 is running...
Task #8 is running...
Task #9 is running...
Task #10 is running...
Task #3 has completed.
Task #4 is running...
Task #1 has completed.
Task #2 has completed.
Task #3 has completed.
Task #4 has completed.
Task #5 has completed.
Task #6 has completed.
Task #7 has completed.
Task #8 has completed.
Task #9 has completed.
Task #10 has completed.
All tasks have completed with newCachedThreadPool.
Task #1 is running...
Task #2 is running...
Task #3 is running...
Task #4 has completed.
Task #5 is running...
Task #1 has completed.
Task #2 has completed.
Task #4 is running...
Task #3 has completed.
Task #5 is running...
Task #6 is running...
Task #5 has completed.
Task #6 is running...
Task #4 has completed.
Task #6 has completed.
Task #7 is running...
Task #5 has completed.
Task #8 is running...
Task #9 is running...
Task #6 has completed.
Task #7 is running...
All tasks have completed with newFixedThreadPool.
Task #7 has completed.
Task #8 has completed.
Task #10 is running...
Task #9 has completed.
Task #7 has completed.
Task #8 is running...
Task #10 has completed.
Task #8 has completed.
Task #9 is running...
Task #9 has completed.
Task #10 is running...
Task #10 has completed.

Process finished with exit code 0
*/