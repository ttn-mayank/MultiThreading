package question1;

public class ThreadClass2 implements Runnable{
    @Override
    public void run() {
        System.out.println("ThreadClass1 using Runnable");
    }
}
