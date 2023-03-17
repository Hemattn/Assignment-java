package Multithreading2;
public class Question2Main {
    public static void main(String[] args) throws InterruptedException {
        Question2 b1=new Question2(20);
        Thread th1=new Thread(b1);
        Question2 b2=new Question2(10);
        Thread th2=new Thread(b2);
        Question2 b3=new Question2(30);
        Thread th3=new Thread(b3);

        th1.start();
        // th1.join();
        th2.start();
        th3.start();

    }
}
/*
Thread-0  Deposited 10.0, new balance is 30.0
Thread-0  Deposited 10.0, new balance is 40.0
Thread-0  Deposited 10.0, new balance is 50.0
Thread-0  Deposited 10.0, new balance is 60.0
Thread-0  Deposited 10.0, new balance is 70.0
Thread-0  Withdrew 5.0, new balance is 65.0
Thread-0  Withdrew 5.0, new balance is 60.0
Thread-0  Withdrew 5.0, new balance is 55.0
Thread-0  Withdrew 5.0, new balance is 50.0
Thread-0  Withdrew 5.0, new balance is 45.0
Thread-1  Deposited 10.0, new balance is 20.0
Thread-1  Deposited 10.0, new balance is 30.0
Thread-1  Deposited 10.0, new balance is 40.0
Thread-1  Deposited 10.0, new balance is 50.0
Thread-1  Deposited 10.0, new balance is 60.0
Thread-1  Withdrew 5.0, new balance is 55.0
Thread-1  Withdrew 5.0, new balance is 50.0
Thread-1  Withdrew 5.0, new balance is 45.0
Thread-1  Withdrew 5.0, new balance is 40.0
Thread-1  Withdrew 5.0, new balance is 35.0
Thread-2  Deposited 10.0, new balance is 40.0
Thread-2  Deposited 10.0, new balance is 50.0
Thread-2  Deposited 10.0, new balance is 60.0
Thread-2  Deposited 10.0, new balance is 70.0
Thread-2  Deposited 10.0, new balance is 80.0
Thread-2  Withdrew 5.0, new balance is 75.0
Thread-2  Withdrew 5.0, new balance is 70.0
Thread-2  Withdrew 5.0, new balance is 65.0
Thread-2  Withdrew 5.0, new balance is 60.0
Thread-2  Withdrew 5.0, new balance is 55.0

Process finished with exit code 0

*/