package pl.mmiskiewicz.threadsUsingInterface;

class RunnableClass implements Runnable {

    private int sleepTime;
    private String threadName;
    public RunnableClass(int sleepTime, String threadName) {
        this.sleepTime = sleepTime;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.printf("Wątek %s, wartość %d%n", threadName, i);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class RunnableClass2 extends RunnableClass implements Runnable {

    private Thread thread;

    public RunnableClass2(int sleepTime, String threadName) {
        super(sleepTime, threadName);
    }

    public void start() {
        if(thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        RunnableClass t1 = new RunnableClass(1000, "Thread 1");
        Thread thread1 = new Thread(t1,"Thread 1");
        thread1.start();

        RunnableClass t2 = new RunnableClass(500, "Thread 2");
        Thread thread2 = new Thread(t2,"Thread 2");
        thread2.start();

        //second possibility to use
        RunnableClass2 t3 = new RunnableClass2(300, "Thread 3");
        t3.start();
    }
}
