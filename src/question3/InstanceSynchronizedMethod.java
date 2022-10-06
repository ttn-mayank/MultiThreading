package question3;

public class InstanceSynchronizedMethod {

    private int val = 0;

    private synchronized void increment(){
        val++;
    }

    private synchronized void decrement(){
        val--;
    }

    public static void main(String[] args) {
        InstanceSynchronizedMethod ins = new InstanceSynchronizedMethod();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<10;i++){
                    ins.increment();
                }
                System.out.println(ins.val);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<10;i++){
                    ins.decrement();
                }
                System.out.println(ins.val);
            }
        });

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ins.val);
    }
}
