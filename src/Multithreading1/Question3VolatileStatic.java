package Multithreading1;

public class Question3VolatileStatic extends Thread{
    //volatile static will ensure that one variable is
    // created for the class, it'll be continuously updated.
    volatile static int temp;
    public void incrementCount1(){
        temp++;
    }

    public void run(){
        System.out.println("***********************");
        System.out.println(Thread.currentThread().getName()+ " Started");
        for(int j=0 ; temp<15 ;j++){
            incrementCount1();
            System.out.println(temp);
        } System.out.println(Thread.currentThread().getName() + " Ended");
    }
}
class Main3{
    public static void main(String[] args) throws InterruptedException {
        Question3VolatileStatic thrObj0= new Question3VolatileStatic();
        Question3VolatileStatic thrObj1= new Question3VolatileStatic();

        thrObj0.start();
        thrObj1.start();
        thrObj1.join();
    }
}

