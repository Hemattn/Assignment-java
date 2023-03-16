package Multithreading1;

public class Question3 extends Thread{
    //Volatile basically loads the variable in main memory.
    // for each thread object a new variable will be created.
    volatile int count;
    public void incrementCount(){
        count++;
    }

    public void run(){
        System.out.println("***********************");
        System.out.println(Thread.currentThread().getName()+ " Started");
        for(int i=0 ; i<15 ;i++){
            incrementCount();
            System.out.println(count);
        }
        System.out.println(Thread.currentThread().getName() + "Ended");
    }
}
class Main2{
    public static void main(String[] args) throws InterruptedException {
        Question3 thr0= new Question3();
        Question3 thr1= new Question3();
        thr0.start();
        thr1.start();
        thr1.join();
    }
}
