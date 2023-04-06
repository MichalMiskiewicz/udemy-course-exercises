package pl.mmiskiewicz.threadsUsingClass;

class TestNewThread extends Thread {

    private int sleepTime;
    public TestNewThread(String name, int sleepTime) {
        super(name);
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.printf("Wątek %s, wartość %d%n", getName(), i);
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {
        TestNewThread thread = new TestNewThread("Thread 1", 1000);
        TestNewThread thread2 = new TestNewThread("Thread 2", 700);

        thread.start();
        thread2.start();
    }
}
