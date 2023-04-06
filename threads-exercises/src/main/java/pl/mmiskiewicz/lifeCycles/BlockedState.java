package pl.mmiskiewicz.lifeCycles;

class SomeThread implements Runnable {

    public static synchronized void test() {
        while (true) {

        }
    }

    @Override
    public void run() {
        test();
    }
}

public class BlockedState {
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new SomeThread());
        Thread thread2 = new Thread(new SomeThread());

        thread1.start();
        thread2.start();

        Thread.sleep(1000);

        System.out.println(thread1.getState()); // thread1 -> stan RUNNABLE
        System.out.println(thread2.getState()); // thread2 -> stan RUNNABLE -> BLOCKED - zablokowany przez pierwszy watek
    }
}