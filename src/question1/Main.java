package question1;

import question1.ThreadClass1;
import question1.ThreadClass2;
import question1.ThreadWithName;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Java MultiThreading");

        // using thread class
        ThreadClass1 x1 = new ThreadClass1();
        x1.start();

        //using Runnable interface
        new Thread(new ThreadClass2()).start();

        //using annonamous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("USing anonymous class");
            }
        }).start();

        //using lambda
        new Thread(()-> System.out.println("Using lambda")).start();

        ThreadWithName t1 = new ThreadWithName("Thread-1");
        ThreadWithName t2 = new ThreadWithName("Thread-2");
        ThreadWithName t3 = new ThreadWithName("Thread-3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}