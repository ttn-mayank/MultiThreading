package question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutornewCachedThreadPool {

    public static void main(final String[] arguments) throws InterruptedException {
        ExecutorService excr = Executors.newCachedThreadPool();
        ThreadPoolExecutor mypool = (ThreadPoolExecutor) excr;
//print statement will print the pool size.
        System.out.println("size of mypool: " + mypool.getPoolSize());
        excr.submit(new ThreadClass2());
        excr.submit(new ThreadClass2());
        System.out.println("Total number threads scheduled): "+ mypool.getTaskCount());
        excr.shutdown();
    }
}
