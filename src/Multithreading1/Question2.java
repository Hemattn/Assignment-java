package Multithreading1;

public class Question2 extends Thread{
    SyncClass obj;
    //constructor of class
    Question2(SyncClass obj){
       this.obj= obj;
    }
    public void run(){
      //  System.out.println(Thread.currentThread().getName()+" started");
       obj.synchronisedMethod();
       obj.synchronizedBlock();
       // System.out.println(Thread.currentThread().getName()+" ended");
    }
}
class SyncClass{
    //synchronizedMethod
    synchronized void synchronisedMethod(){
        System.out.println(Thread.currentThread().getName());
        for (int i=0 ; i<2 ;i++)
            try{
                    System.out.println(Thread.currentThread().getName() +" "+i);
            }
             catch (Exception e){

        }
    }

    void  synchronizedBlock(){
        //synchronized block
        synchronized (this){
            System.out.println(Thread.currentThread().getName());
            for (int i=0 ; i<2 ;i++)
                try{
                System.out.println(Thread.currentThread().getName() +" "+i);
            }
             catch (Exception e){

            }
        }
    }
}

class Main4{
    public static void main(String[] args) {
        SyncClass obj= new SyncClass();

        Question2 thread1= new Question2(obj);
        Question2 thread2= new Question2(obj);
        Question2 thread3= new Question2(obj);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
/*
*Output:
* Thread-0
Thread-0 0
Thread-0 1
Thread-0
Thread-0 0
Thread-0 1
Thread-2
Thread-2 0
Thread-2 1
Thread-2
Thread-2 0
Thread-2 1
Thread-1
Thread-1 0
Thread-1 1
Thread-1
Thread-1 0
Thread-1 1

Process finished with exit code 0
*/
