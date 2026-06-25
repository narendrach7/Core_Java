package com.multithreading.in;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
//import java.util.concurrent.locks.Mutex;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.atomic.AtomicInteger;

class BankAccount {
    private int balance;
    private final ReentrantLock lock = new ReentrantLock();

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Synchronized method
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Synchronized block
    public void withdrawBlock(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } finally {
            lock.unlock();
        }
    }

    // ReentrantLock
    public void withdrawLock(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } finally {
            lock.unlock();
        }
    }

    // Condition variable
    public void withdrawCondition(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
                System.out.println("Condition variable signaled.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } finally {
            lock.unlock();
        }
    }

    // Semaphore
    public void withdrawSemaphore(int amount) {
        int permits = 1;
        Semaphore semaphore = new Semaphore(permits);
        try {
            semaphore.acquire();
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
        }
    }

    // Mutex
//    public void withdrawMutex(int amount) {
//        Mutex mutex = new Mutex();
//        mutex.lock();
//        try {
//            if (balance >= amount) {
//                balance -= amount;
//                System.out.println("Withdrawal successful. Remaining balance: " + balance);
//            } else {
//                System.out.println("Insufficient balance.");
//            }
//        } finally {
//            mutex.unlock();
//        }
//    }

    // Read-write lock
    public void withdrawReadWriteLock(int amount) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        lock.writeLock().lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    // Atomic variable
    public void withdrawAtomic(int amount) {
        AtomicInteger balance = new AtomicInteger(this.balance);
        int newBalance = balance.getAndAdd(-amount);
        if (newBalance >= 0) {
            System.out.println("Withdrawal successful. Remaining balance: " + newBalance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}


public class synchronization_keywords {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(100);
        Thread thread1 = new Thread(() -> account.withdraw(50));
        Thread thread2 = new Thread(() -> account.withdrawBlock(50));
        Thread thread3 = new Thread(() ->account.withdrawLock(50));
        Thread thread4 = new Thread(() -> account.withdrawCondition(50));
        Thread thread5 = new Thread(() -> account.withdrawSemaphore(50));
//        Thread thread6 = new Thread(() -> {
//            account.withdrawMutex(50);
//        });
        Thread thread7 = new Thread();
	}

}
