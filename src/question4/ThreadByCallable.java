package question4;

import java.util.concurrent.Callable;

public class ThreadByCallable implements Callable {
    @Override
    public Boolean call() throws Exception {

        System.out.println("Thread run from callable interface");
        return true;
    }
}
