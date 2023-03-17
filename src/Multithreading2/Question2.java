package Multithreading2;

import java.util.concurrent.locks.ReentrantLock;

public class Question2 implements Runnable {
    private static ReentrantLock lock = new ReentrantLock();
    double balance;

    public Question2(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName()+"  Deposited " + amount + ", new balance is " + balance);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName()+"  Withdrew " + amount + ", new balance is " + balance);
            } else {
                System.out.println("Insufficient funds");
            }
        } finally {
            lock.unlock();
        }
    }
    public void run(){
        for(int i=0;i<5;i++)
            deposit(10);
        for (int i=0;i<5;i++)
            withdraw(5);

    }
}

