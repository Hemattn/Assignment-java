package Multithreading1;


public class Question1Interface implements Runnable{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" Started");
        try {
            //sleep will make the thread wait, once the time is over it'll
            // come back to runnable state.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" Ended");

    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        Question1Interface runObj0=new Question1Interface();
        Question1Interface runObj1=new Question1Interface();
        Question1Interface runObj2=new Question1Interface();
        Thread thread0=new Thread(runObj0);
        Thread thread1=new Thread(runObj1);
        Thread thread2=new Thread(runObj2);
        thread0.start();
        thread2.start();
        //join will ensure that the thread will run entirely then only
        //next thread will start.
        thread2.join();
        thread1.start();
    }
}