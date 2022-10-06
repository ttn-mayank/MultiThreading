package question1;

import java.net.SocketOption;

public class ThreadWithName extends Thread{

    public ThreadWithName(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(getName()+" is started");

        if(getName().equalsIgnoreCase("Thread-1")){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for(int i=1;i<11;i++){
            System.out.println("From "+getName()+" : task="+i);
        }
        System.out.println(getName()+"is ended");
    }
}
