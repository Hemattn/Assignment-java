package Multithreading1;

public class Question2 extends Thread{
/* Use Synchronize method and synchronize block to enable
 synchronization between multiple threads trying to
 access method at same time.*/

    public void run(){
        System.out.println(Thread.currentThread().getName()+" started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" ended");
    }
}
