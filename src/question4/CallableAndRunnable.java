package question4;

import java.net.SocketOption;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableAndRunnable {
    public static void main(String[] args) {

        FutureTask f1 = new FutureTask(new ThreadByCallable());
        Thread T1 = new Thread(f1);
        T1.start();
        try {
            System.out.println(f1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        Thread T2 = new Thread(new ThreadClass2());
        T2.start();

    }
}
