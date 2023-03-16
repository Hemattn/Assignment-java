package Multithreading1;

public class Question1Class  extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+"Ended");
    }
}

class Main1{
    public static void main(String[] args) throws InterruptedException {
        Question1Class th0=new Question1Class();
        Question1Class th1=new Question1Class();
        Question1Class th2=new Question1Class();
        Question1Class th3=new Question1Class();

        th1.start();
        th0.start();
        th0.join();
        th3.start();
        th2.start();


    }
}


