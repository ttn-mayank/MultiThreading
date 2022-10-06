package question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutornewFixedThreadPool {

    public static void main(String[] args) {
        ThreadFactory ThreadFactory = Executors.defaultThreadFactory();
        ExecutorService excr = Executors.newFixedThreadPool(5 , ThreadFactory);
        ThreadPoolExecutor mypool = (ThreadPoolExecutor) excr;
        System.out.println("size of mypool: " + mypool.getPoolSize());
        excr.submit(new ThreadClass2());
        excr.shutdown();
    }
}
